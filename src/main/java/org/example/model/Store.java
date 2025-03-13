package org.example.model;

public class Store {
    public static void main(String[] args) {
        Bread bread = new Bread("type", 10, "White bread");
        Chocolate chocolate = new Chocolate("bitter", 15, "bitter chocolate");
        Coke coke = new Coke("Cola", 25, "coke is diet");
        ProductForSale[] products = {bread,chocolate,coke};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}