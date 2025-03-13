package org.example.model;

public class Chocolate extends ProductForSale {
    public boolean bitter;
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        bitter=true;
    }

    @Override
    public void showDetails() {
        System.out.println("Bitter:" + bitter +super.toString());
    }
}
