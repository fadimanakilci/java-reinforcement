package org.example.dataAccess.category;

import org.example.entities.category.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    //  private List<Category> categories;

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklenen category = " + category.getName());
        //  fetch();
    }

    @Override
    public List<Category> fetch() {
        System.out.println("Hibernate ile veritabanından getirilen categories.");
        //  Veritabanı bağlantısı olmadığı için category listesi oluşturduk
        List<Category> categories = new ArrayList<Category>();
        categories.add(new Category(1, "Category 1"));
        categories.add(new Category(2, "Category 2"));
        categories.add(new Category(3, "Category 3"));

        //  this.categories.addAll(categories);
        return categories;
    }
}
