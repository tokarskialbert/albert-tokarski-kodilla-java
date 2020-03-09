package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.displayTitles(movieStore.getMovies()));

    }
}
