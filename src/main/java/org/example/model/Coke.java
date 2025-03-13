package org.example.model;

import java.util.concurrent.SubmissionPublisher;

public class Coke extends ProductForSale {
    public boolean isDiet;
    public Coke(String type, int price, String description) {
        super(type, price, description);
        isDiet=true;
    }

    @Override
    public void showDetails() {
        System.out.println("isDiet:"+ isDiet + super.toString());
    }
}
