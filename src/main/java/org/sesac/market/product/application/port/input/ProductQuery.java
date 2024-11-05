package org.sesac.market.product.application.port.input;

import org.sesac.market.product.application.dto.request.ReadProductRequest;
import org.sesac.market.product.application.dto.request.ReadProductsRequest;
import org.sesac.market.product.domain.model.Product;
import org.springframework.data.domain.Page;

public interface ProductQuery {
    Product read(ReadProductRequest query);

    Page<Product> read(ReadProductsRequest query);
}
