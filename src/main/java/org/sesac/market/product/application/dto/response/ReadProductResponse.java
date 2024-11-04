package org.sesac.market.product.application.dto.response;

import lombok.Builder;

import java.time.OffsetDateTime;

@Builder(toBuilder = true)
public record ReadProductResponse(
        Long id,
        String name,
        String image,
        String description,
        int price,
        int stock,
        OffsetDateTime createdDate,
        OffsetDateTime modifiedDate
) {
}