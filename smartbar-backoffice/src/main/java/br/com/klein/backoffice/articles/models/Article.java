package br.com.klein.backoffice.articles.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

import br.com.klein.backoffice.baseEntity.BaseEntity;
import br.com.klein.backoffice.categories.models.Category;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"name", "category_id"})
})
@NamedQuery(name = "Article.byCategory", query = "from Article where category.id = :id order by price desc")
@NamedQuery(name = "Article.nameContaining", query = "from Article where name like concat('%', concat(?1, '%'))")
public class Article extends BaseEntity {

    @NotNull
    public String name;

    @NotNull
    @Positive
    public BigDecimal price;

    @NotNull
    public String description;

    @NotNull
    public String pictureBase64;

    @ManyToOne(optional = false)
    @JoinColumn(name = "category_id")
    public Category category;

}