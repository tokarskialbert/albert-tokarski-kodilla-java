package com.kodilla.good.patterns.homework1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        ExtraFoodShop.products.put(new Product("Apple", 1.5), 10);
        ExtraFoodShop.products.put(new Product("Pear", 2.5), 15);

        List<FoodProducer> producerList = availableProducers();

        FoodProducer producer = producerList.get(0);

        System.out.println(producer.getProducerInfo());

        Cart cart = new Cart();

        Scanner scanner = new Scanner(System.in);

        for(Map.Entry<Product, Integer> product : producer.getAvailableProducts().entrySet()) {
            System.out.println("Produkt: " + product.getKey().getProductName() + ", cena: " + product.getKey().getPrice() + ", na magazynie :" + product.getValue());
            System.out.print("Ile sztuk zamawiasz? ");
            cart.addProduct(product.getKey(), scanner.nextInt());
        }

        FoodProvider provider = (FoodProvider)producer;
        provider.process(cart);
    }

    private static List<FoodProducer> availableProducers() {
        return Arrays.asList(new ExtraFoodShop(), new GlutenFreeShop(), new HealthyShop());
    }
}