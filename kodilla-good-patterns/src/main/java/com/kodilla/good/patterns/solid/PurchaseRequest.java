package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User buyer;
    private Item item;
    private LocalDateTime purchaseTime;

    public PurchaseRequest(User buyer, Item item, LocalDateTime purchaseTime) {
        this.buyer = buyer;
        this.item = item;
        this.purchaseTime = purchaseTime;
    }

    public User getBuyer() {
        return buyer;
    }

    public Item getItem() {
        return item;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }
}
