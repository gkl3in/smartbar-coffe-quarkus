package br.com.klein.backoffice.categories.repositories;

import br.com.klein.backoffice.categories.models.Category;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriesRepository implements PanacheRepositoryBase<Category, Long> {
}