package br.com.klein.backoffice.articles.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

import br.com.klein.backoffice.articles.models.Article;
import br.com.klein.backoffice.categories.models.Category;

@ApplicationScoped
public class ArticlesRepository implements PanacheRepositoryBase<Article, Long> {

    public List<Article> listAllInCategory(final Category category) {
        return list("category", category);
    }
}