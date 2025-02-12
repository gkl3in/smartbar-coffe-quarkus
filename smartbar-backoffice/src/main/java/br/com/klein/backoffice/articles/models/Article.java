package br.com.klein.backoffice.articles.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

import br.com.klein.backoffice.BaseEntity;
import br.com.klein.backoffice.categories.models.Category;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name", "category_id"})
})
@NamedQuery(name = "Article.byCategory", query = "from Article where category.id = :id order by price desc")
@NamedQuery(name = "Article.nameContaining", query = "from Article where name like concat('%', concat(?1, '%'))")
public class Article extends BaseEntity {

    @NotNull
    private String name;

    @NotNull
    @Positive
    private BigDecimal price;

    @NotNull
    private String description;

    @NotNull
    private String pictureBase64;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    private Category category;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureBase64() {
        return pictureBase64;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictureBase64(String pictureBase64) {
        this.pictureBase64 = pictureBase64;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}