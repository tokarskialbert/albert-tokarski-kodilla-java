package com.kodilla.good.patterns.solid;

public class MainClass {
    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new MailService(), new BookPurchaseService(), new BookPurchaseRepository());
        purchaseProcessor.process(purchaseRequest);
    }
}
