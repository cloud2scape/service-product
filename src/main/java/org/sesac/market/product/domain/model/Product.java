package org.sesac.market.product.domain.model;

import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.Entity;
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
public class Product extends BaseTimeEntity {
    @Id
    @Tsid
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

    public Product update(Product product) {
        this.name = product.name != null ? product.name : this.name;
        this.image = product.image != null ? product.image : this.image;
        this.description = product.description != null ? product.description : this.description;
        this.price = product.price;
        this.stock = product.stock;
        return this;
    }
}
