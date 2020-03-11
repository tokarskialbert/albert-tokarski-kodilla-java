package com.kodilla.good.patterns.solid;

public class Item {

    private long itemID;
    private double price;
    private User owner;

    public Item(long itemID, double price, User owner) {
        this.itemID = itemID;
        this.price = price;
        this.owner = owner;
    }
}
