package com.timbuchalka;

public class DeluxeBurger extends BillsBurger {
    public DeluxeBurger(double price, String meat, String bun) {
        super(price, meat, bun);
        this.setName("Deluxe Burger");

        // chips and drink included (at time of creation)
        this.addTopping(new Topping("Chips",0.0));
        this.addTopping(new Topping("Drink",0.0));

        // no additional toppings
        this.setMaxToppings(2);
    }
}
