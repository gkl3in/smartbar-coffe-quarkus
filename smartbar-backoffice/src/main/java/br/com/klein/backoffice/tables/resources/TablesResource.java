package br.com.klein.backoffice.tables.resources;

import br.com.klein.backoffice.tables.models.Table;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(rolesAllowed = {"admin"})
public interface TablesResource extends PanacheEntityResource<Table, Long> {
}