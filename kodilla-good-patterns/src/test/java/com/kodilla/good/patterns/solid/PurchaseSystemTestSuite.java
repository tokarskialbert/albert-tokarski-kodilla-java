package com.kodilla.good.patterns.solid;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class PurchaseSystemTestSuite {

    @Test
    public void testUserFromPurchaseRequestRetriever() {

        //given
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();

        //when
        User testBuyer = new User("user1", "user1@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888");

        //then
        Assert.assertTrue(purchaseRequestRetriever.retrieve().getBuyer().equals(testBuyer));
    }

    @Test
    public void testItemFromPurchaseRequestRetriever() {

        //given
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();

        //when
        Item testItem = new Item(1, 21.22, new User("user2", "user2@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888"));

        //then
        Assert.assertTrue(purchaseRequestRetriever.retrieve().getItem().equals(testItem));
    }

    @Test
    public void buyFromPurchaseService() {

        //given
        PurchaseService purchaseService = new BookPurchaseService();

        //when
        User testBuyer = new User("user1", "user1@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888");
        Item testItem = new Item(1, 21.22, new User("user2", "user2@gmail.com", "ul. Sloneczna, 98988 Wilkowyje", "888888888"));
        LocalDateTime purchaseTime = LocalDateTime.of(2020, 12, 12, 12, 33);

        boolean testBoolean = purchaseService.buy(testBuyer, testItem, purchaseTime);

        //then
        Assert.assertTrue(testBoolean);
    }

    @Test
    public void buyProcessFromPurchaseProcessor() {

        //given
        InformationService informationService = new MailService();
        PurchaseService purchaseService = new BookPurchaseService();
        PurchaseRepository purcahseRepository = new BookPurchaseRepository();

        PurchaseRequest testPurchaseRequest = new PurchaseRequestRetriever().retrieve();
        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(informationService, purchaseService, purcahseRepository);

        //when
        PurchaseDto testPurchaseDto = purchaseProcessor.process(testPurchaseRequest);

        //then
        Assert.assertTrue(testPurchaseDto.getPurchaseStatus());
    }
}
