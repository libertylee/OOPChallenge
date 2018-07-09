package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// Bill's Burgers Menu:
        // Bread Roll Types
        String brioche = "brioche";
        String sesame = "sesame seed";
        String wheat = "whole wheat";

        // Topping Types
        Topping bacon = new Topping("Bacon", 1.0f);
        Topping cheese = new Topping("Cheese", 1.0f);
        Topping lettuce = new Topping("Lettuce", .25f);
        Topping tomato = new Topping("Tomato", .5f);
        Topping onion = new Topping("Onion", .5f);
        Topping spinach = new Topping("Spinach", 1.0f);
        Topping hotPeppers = new Topping("Hot peppers", 1.0f);
        Topping chips = new Topping("Chips", 1.25f);
        Topping drink = new Topping("Drink", 1.5f);

    // Tests
        // Base hamburger under topping limit
        System.out.println("Ordering a Bill's burger...");
        BillsBurger underBurger = new BillsBurger(4.00f, "beef", sesame);
        underBurger.addTopping(cheese);
        underBurger.addTopping(drink);
        underBurger.displayPrice();

        // Base hamburger max topping limit
        System.out.println("Ordering a Bill's burger...");
        BillsBurger maxBurger = new BillsBurger(3.00f, "chicken", brioche);
        maxBurger.addTopping(bacon);
        maxBurger.addTopping(tomato);
        maxBurger.addTopping(chips);
        maxBurger.addTopping(drink);
        maxBurger.displayPrice();

        // Base hamburger over topping limit
        System.out.println("Ordering a Bill's burger...");
        BillsBurger overBurger = new BillsBurger(4.00f, "veggie", wheat);
        overBurger.addTopping(tomato);
        overBurger.addTopping(spinach);
        overBurger.addTopping(hotPeppers);
        overBurger.addTopping(drink);
        overBurger.addTopping(new Topping("Should not be able to add",42.0f));
        overBurger.displayPrice();


        // Healthy burger
        System.out.println("Ordering a Healthy burger...");
        HealthyBurger healthyBurger = new HealthyBurger(3.00f,"chicken");
        healthyBurger.addTopping(spinach);
        healthyBurger.addTopping(lettuce);
        healthyBurger.addTopping(tomato);
        healthyBurger.addTopping(onion);
        healthyBurger.addTopping(hotPeppers);
        healthyBurger.addTopping(drink);
        healthyBurger.addTopping(new Topping("Should not be able to add",42.0f));
        healthyBurger.displayPrice();

        // Deluxe burger
        System.out.println("Ordering a Deluxe burger...");
        DeluxeBurger deluxeBurger = new DeluxeBurger(6.00f,"beef", sesame);
        deluxeBurger.addTopping(new Topping("Should not be able to add",42.0f));
        deluxeBurger.displayPrice();
    }

}
