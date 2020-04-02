package com.kodilla.good.patterns.solid;

import java.util.Objects;

public class Item {

    private long itemID;
    private double price;
    private User owner;

    public Item(long itemID, double price, User owner) {
        this.itemID = itemID;
        this.price = price;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemID == item.itemID &&
                Double.compare(item.price, price) == 0 &&
                Objects.equals(owner, item.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemID, price, owner);
    }
}
