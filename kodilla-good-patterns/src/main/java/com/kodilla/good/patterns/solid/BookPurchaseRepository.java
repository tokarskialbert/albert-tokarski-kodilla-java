package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class BookPurchaseRepository implements PurchaseRepository {

    @Override
    public boolean createPurchase(User buyer, LocalDateTime purchaseTime, Item item) {
        return false;
    }
}
