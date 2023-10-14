package org.example.dataAccess.product;

import org.example.entities.product.Product;

public class HibernateProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklenen product = " + product.getName());
    }
}
