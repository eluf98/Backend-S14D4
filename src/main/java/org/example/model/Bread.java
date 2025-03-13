package org.example.model;

import java.sql.SQLOutput;

public class Bread extends ProductForSale{
    public String type;
    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.type= type;
    }
    public String getType() {
        return type;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Type: " + type);
    }

}
