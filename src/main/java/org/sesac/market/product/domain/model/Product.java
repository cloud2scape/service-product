package org.sesac.market.product.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("ID")
    private Long id;

    @Comment("상품명")
    private String name;

    @Comment("이미지")
    private String image;

    @Comment("설명")
    private String description;

    @Comment("가격")
    private int price;

    @Comment("재고")
    private int stock;
}
