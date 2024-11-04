package org.sesac.market.product.application.dto.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record ReadProductsResponse(
        Long id,
        String name,
        String image,
        String description,
        int price,
        int stock
) {
}