package org.example;

import org.example.business.category.CategoryControlManager;
import org.example.business.category.CategoryManager;
import org.example.business.category.CategoryNameControlManager;
import org.example.business.course.*;
import org.example.business.product.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.category.JdbcCategoryDao;
import org.example.dataAccess.course.JdbcCourseDao;
import org.example.dataAccess.product.JdbcProductDao;
import org.example.entities.category.Category;
import org.example.entities.course.Course;
import org.example.entities.product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product = new Product(1, "IPhone Xr", 10, 35000);
        ProductManager productManager = getProductManager();
        productManager.add(product);

        //  Bu kategori zaten var. Sistem hata verip duracak.
        //  Category category = new Category(1, "Category 1");
        Category category = new Category(1, "Category 11");
        CategoryControlManager[] categoryControlManagers = {
                new CategoryNameControlManager(),
        };
        //  CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), List.of(categoryControlManagers));
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), List.of(categoryControlManagers));
        categoryManager.add(category);

        //  Bu kurs zaten var. Sistem hata verip duracak.
        //  Course course = new Course(1, 3, "Course 1", 1500);
        Course course = new Course(1, 3, "Java Kursu", 1500);
        CourseControlManager[] courseControlManagers = {
          new CourseNameControlManager(),
        };
        //  CourseManager courseManager = new CourseManager(new HibernateCourseDao(), List.of(courseControlManagers));
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), List.of(courseControlManagers));
        courseManager.add(course);
    }

    private static ProductManager getProductManager() {
        Logger[] loggers = {
                new DatabaseLogger(),
                new FileLogger(),
                new MailLogger(),
        };
        //  ProductManager a constructor fonksiyon eklediğimiz için alttaki yapıyı kullanıyoruz.
        //  Artık veritabanı kayıtlarını yapmak için kullanılan metodu değiştirmeyi buradan yapacağız.
        /*
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        */
        //  ProductManager productManager = new ProductManager(new HibernateProductDao(), List.of(loggers));
        return new ProductManager(new JdbcProductDao(), List.of(loggers));
    }
}