package org.example.business.category;

import org.example.entities.category.Category;

import java.util.List;

public class CategoryNameControlManager implements CategoryControlManager{
    private boolean finded = false;
    //  private String value;
    //  private List<Category> categories;

    //  public CategoryNameControlManager(String value, List<Category> categories) {
    //      this.value = value;
    //      this.categories = categories;
    //  }

    @Override
    public boolean isEqual(String value, List<Category> categories) {
        for (Category category : categories){
            if(category.getName().equals(value)){
                finded = true;
                return finded;
            } else {
                finded = false;
            }
        }
        return finded;
    }

    public boolean isEmpty(List<Category> categories) {
        return categories.isEmpty();
    }
}
