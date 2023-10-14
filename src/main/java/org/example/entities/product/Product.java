package org.example.entities.product;

public class Product {
    private int id;
    private String name;
    private double discount;
    private double unitPrice;

    public Product() {
        super();
    }

    public Product(int id, String name, double discount, double unitPrice) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
