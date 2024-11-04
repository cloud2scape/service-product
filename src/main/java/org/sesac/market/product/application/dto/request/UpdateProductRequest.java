package org.sesac.market.product.application.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;

@Builder(toBuilder = true)
public record UpdateProductRequest(
        @NotNull Long id,
        @NotEmpty String name,
        @NotEmpty String image,
        @NotNull String description,
        @NotNull @PositiveOrZero int price,
        @NotNull @Positive int stock
) {
}
