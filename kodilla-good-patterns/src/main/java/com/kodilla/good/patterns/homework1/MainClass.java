package com.kodilla.good.patterns.homework1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){

        ExtraFoodShop.products.put(new Product("Apple", 1.5), 10);
        ExtraFoodShop.products.put(new Product("Pear", 2.5), 15);

        GlutenFreeShop.products.put(new Product("TV", 1000), 10);
        GlutenFreeShop.products.put(new Product("Airplane", 500), 15);

        List<FoodProducer> producerList = availableProducers();

        FoodProducer producer1 = producerList.get(0);
        FoodProducer producer2 = producerList.get(1);

        Cart cart = new Cart();

        OrderCollector orderCollector = new OrderCollector();
        System.out.println(producer1.getProducerInfo());
        orderCollector.doOrder(producer1, cart);
        System.out.println(producer2.getProducerInfo());
        orderCollector.doOrder(producer2, cart);

        cart.processCart();
    }

    private static List<FoodProducer> availableProducers() {
        return Arrays.asList(new ExtraFoodShop(), new GlutenFreeShop(), new HealthyShop());
    }
}