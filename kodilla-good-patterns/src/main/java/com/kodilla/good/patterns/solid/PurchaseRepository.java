package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public interface PurchaseRepository {
    boolean createPurchase(User buyer, LocalDateTime purchaseTime, Item item);
}
