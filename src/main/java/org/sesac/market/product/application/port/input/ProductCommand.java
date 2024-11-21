package org.sesac.market.product.application.port.input;

import org.sesac.market.product.application.dto.request.CreateProductRequest;
import org.sesac.market.product.application.dto.request.DeleteProductRequest;
import org.sesac.market.product.application.dto.request.UpdateProductRequest;
import org.sesac.market.product.application.dto.request.UpdateProductStockDecreaseRequest;
import org.sesac.market.product.domain.model.Product;

public interface ProductCommand {
    Product create(CreateProductRequest request);

    Product update(UpdateProductRequest request);

    boolean delete(DeleteProductRequest request);

    Product updateStock(UpdateProductStockDecreaseRequest request);
}
