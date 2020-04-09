package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public interface PurchaseService {

    boolean buy(User user, Item item, LocalDateTime dateOfPurchase);
}
