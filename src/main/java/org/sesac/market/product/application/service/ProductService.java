package org.sesac.market.product.application.service;

import lombok.RequiredArgsConstructor;
import org.sesac.market.product.application.dto.request.*;
import org.sesac.market.product.application.port.input.ProductCommand;
import org.sesac.market.product.application.port.input.ProductQuery;
import org.sesac.market.product.application.port.output.ProductPort;
import org.sesac.market.product.domain.exception.BizException;
import org.sesac.market.product.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService implements ProductCommand, ProductQuery {
    private final ProductPort port;

    @Override
    @Transactional
    public Product create(CreateProductRequest request) {
        return port.save(Product.builder()
                .name(request.name())
                .image(request.image())
                .description(request.description())
                .price(request.price())
                .stock(request.stock())
                .build());
    }

    @Override
    @Transactional
    public Product update(UpdateProductRequest request) {
        Product product = port.get(request.id())
                .orElseThrow(BizException.NoneExists::new);

        return product.update(Product.builder()
                .name(request.name())
                .image(request.image())
                .description(request.description())
                .price(request.price())
                .stock(request.stock())
                .build());
    }

    @Override
    @Transactional
    public boolean delete(DeleteProductRequest request) {
        if (!port.exists(request.id())) {
            throw new BizException.NoneExists();
        }

        Product product = Product.builder()
                .id(request.id())
                .build();

        port.delete(product);
        return true;
    }

    @Override
    public Product read(ReadProductRequest query) {
        return port.get(query.id())
                .orElseThrow(BizException.NoneExists::new);
    }

    @Override
    public Page<Product> read(ReadProductsRequest query) {
        return port.getMultiple(query.pageable());
    }
}
