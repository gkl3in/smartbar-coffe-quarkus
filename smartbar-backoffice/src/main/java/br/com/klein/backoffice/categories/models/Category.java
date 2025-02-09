package br.com.klein.backoffice.categories.models;

import br.com.klein.backoffice.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})
public class Category extends BaseEntity {
    @NotNull
    public String name;

    @NotNull
    public String description;
}