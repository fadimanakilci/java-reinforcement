package org.example.business.category;

import org.example.entities.category.Category;

import java.util.List;

public interface CategoryControlManager {
    boolean isEqual(String value, List<Category> categories);

    boolean isEmpty(List<Category> categories);
}
