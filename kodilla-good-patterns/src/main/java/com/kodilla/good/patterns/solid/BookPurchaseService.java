package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class BookPurchaseService implements PurchaseService {

    @Override
    public boolean buy(User buyer, Item item, LocalDateTime dateOfPurchase) {
        return false;
    }
}
