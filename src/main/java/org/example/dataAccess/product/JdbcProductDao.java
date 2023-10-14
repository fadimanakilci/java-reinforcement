package org.example.dataAccess.product;

import org.example.entities.product.Product;

public class JdbcProductDao implements ProductDao{
    @Override
    public  void add(Product product) {
        System.out.println("JDBC ile veritabanına eklenen product = " + product.getName());
    }
}
