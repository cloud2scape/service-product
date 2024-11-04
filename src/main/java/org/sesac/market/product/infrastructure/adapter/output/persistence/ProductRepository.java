package org.sesac.market.product.infrastructure.adapter.output.persistence;

import org.sesac.market.product.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
