package com.kodilla.good.patterns.solid;

public class PurchaseDto {

    private User buyer;
    private boolean purchaseStatus;

    public PurchaseDto(User buyer, boolean purchaseStatus) {
        this.buyer = buyer;
        this.purchaseStatus = purchaseStatus;
    }

    public User getBuyer() {
        return buyer;
    }

    public boolean getPurchaseStatus() {
        return purchaseStatus;
    }
}
