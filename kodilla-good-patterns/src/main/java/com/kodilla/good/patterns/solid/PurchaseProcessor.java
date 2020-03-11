package com.kodilla.good.patterns.solid;

public class PurchaseProcessor {

    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purcahseRepository;

    public PurchaseProcessor(final InformationService informationService,
                             final PurchaseService purchaseService,
                             final PurchaseRepository purcahseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purcahseRepository = purcahseRepository;
    }

    public PurchaseDto process(final PurchaseRequest purchaseRequest) {

        boolean isBought = purchaseService.buy(purchaseRequest.getBuyer(), purchaseRequest.getItem(), purchaseRequest.getPurchaseTime());

        if(isBought) {
            informationService.inform(purchaseRequest.getBuyer());
            purcahseRepository.createPurchase(purchaseRequest.getBuyer(), purchaseRequest.getPurchaseTime(), purchaseRequest.getItem());

            return new PurchaseDto(purchaseRequest.getBuyer(), true);
        } else {

            return new PurchaseDto(purchaseRequest.getBuyer(), false);
        }
    }
}
