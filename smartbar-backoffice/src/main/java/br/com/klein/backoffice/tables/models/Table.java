package br.com.klein.backoffice.tables.models;

import br.com.klein.backoffice.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

@Entity
@jakarta.persistence.Table(name = "Sbo_Table", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
})
public class Table extends BaseEntity {

    @NotNull
    public String name;

    @NotNull
    public Integer seatCount;

    @NotNull
    public Boolean active;

}