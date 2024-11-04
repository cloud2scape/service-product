package org.sesac.market.product.application.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;

@Builder(toBuilder = true)
public record CreateProductRequest(
        @NotEmpty String name,
        @NotEmpty String description,
        @NotEmpty String image,
        @NotNull @PositiveOrZero int price,
        @NotNull @Positive int stock
) {
}
