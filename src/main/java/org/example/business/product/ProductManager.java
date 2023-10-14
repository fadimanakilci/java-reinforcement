package org.example.business.product;

import org.example.core.logging.Logger;
import org.example.dataAccess.product.ProductDao;
import org.example.entities.product.Product;

import java.util.List;

// ProductService
public class ProductManager {
    private List<Logger> loggers;
    private ProductDao productDao;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.loggers = loggers;
        this.productDao = productDao;
    }
    // Business Rules
    public void add(Product product) throws Exception {
        if(product.getUnitPrice() < 10) {

            throw new Exception("Ürün fiyatı 10'dan küçük olamaz!");
        }
        /*  Burası ileride değiştirilmek ya da geliştirilmek için uygun değil.
        Bu yüzden interfaceleri kullanmalıyız.

        JdbcProductDao jdbcProductDao = new JdbcProductDao();
        jdbcProductDao.add(product);

        HibernateProductDao hibernateProductDao = new HibernateProductDao();
        hibernateProductDao.add(product);
        */

//        Bir katman başka bir katmanın classına sadece interfaceden erişim sağlamalı.
//        Bu yüzden new ile nesne oluşturmak yerine private değişken ve constructor fonksiyon kullan
//        ProductDao productDao = new JdbcProductDao();
        productDao.add(product);
        for (Logger logger : loggers){
            logger.log(product.getName() + " adlı ürün eklendi.");
        }
    }
}
