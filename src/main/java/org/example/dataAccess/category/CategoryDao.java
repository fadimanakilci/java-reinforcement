package org.example.dataAccess.category;

import org.example.entities.category.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);

    List<Category> fetch();
}
