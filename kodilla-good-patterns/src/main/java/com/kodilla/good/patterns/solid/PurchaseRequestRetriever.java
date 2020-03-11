package com.kodilla.good.patterns.solid;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {

        User buyer = new User("user1", "user1@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888");
        Item item = new Item(1, 21.22, new User("user2", "user2@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888"));
        LocalDateTime purchaseTime = LocalDateTime.of(2020, 12, 12, 12, 33);

        return new PurchaseRequest(buyer, item, purchaseTime);
    }
}
