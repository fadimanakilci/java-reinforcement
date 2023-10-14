package org.example.business.category;

import org.example.dataAccess.category.CategoryDao;
import org.example.entities.category.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<CategoryControlManager> categoryControlManagers;
    private List<Category> categories = new ArrayList<Category>();

    public CategoryManager(CategoryDao categoryDao, List<CategoryControlManager> categoryControlManagers) {
        this.categoryDao = categoryDao;
        this.categoryControlManagers = categoryControlManagers;
    }

    public void add(Category category) throws Exception {
        categories.addAll(categoryDao.fetch());
        for (CategoryControlManager categoryControlManager : categoryControlManagers){
            boolean isEqual = categoryControlManager.isEqual(category.getName(), categories);
            if (isEqual) {
                throw new Exception("Kategori kayıtlı! Farklı kategori ekleyin!");
            } else {
                categoryDao.add(category);
            }
        }
    }
}
