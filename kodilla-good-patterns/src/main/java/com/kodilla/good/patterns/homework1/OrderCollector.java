package com.kodilla.good.patterns.homework1;

import java.util.Map;
import java.util.Scanner;

public class OrderCollector {
    public void doOrder(FoodProducer foodProducer, Cart cart) {
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Product, Integer> map: foodProducer.getAvailableProducts().entrySet()) {
            System.out.println("Produkt: " + map.getKey().getProductName() + ", cena: " + map.getKey().getPrice() + ", na magazynie :" + map.getValue());
            System.out.print("Ile sztuk zamawiasz? ");
            cart.addProduct(foodProducer, map.getKey(), scanner.nextInt());
        }
    }
}
