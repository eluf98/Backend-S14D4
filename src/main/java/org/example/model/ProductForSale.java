package org.example.model;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public int getSalesPrice(int quality){
        return  quality*price;
    }
    public abstract void showDetails();
}
