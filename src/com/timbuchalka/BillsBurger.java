package com.timbuchalka;

public class BillsBurger {
    private String name;
    private double price;
    private String meat;
    private String bun;

    // up to 4 toppings
    private int toppings;
    private int maxToppings;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;

    public BillsBurger(double price, String meat, String bun) {
        this.price = price;
        this.meat = meat;
        this.bun = bun;

        this.name = "Bill's Burger";
        this.toppings = 0;
        this.maxToppings = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }

    public String getBun() {
        return bun;
    }

    public int getToppings() {
        return toppings;
    }

    public void incrementToppings() {
        this.toppings += 1;
    }

    public int getMaxToppings() {
        return maxToppings;
    }

    public void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public void setTopping1(Topping topping1) {
        this.topping1 = topping1;
    }

    public Topping getTopping2() {
        return topping2;
    }

    public void setTopping2(Topping topping2) {
        this.topping2 = topping2;
    }

    public Topping getTopping3() {
        return topping3;
    }

    public void setTopping3(Topping topping3) {
        this.topping3 = topping3;
    }

    public Topping getTopping4() {
        return topping4;
    }

    public void setTopping4(Topping topping4) {
        this.topping4 = topping4;
    }

    public void addTopping(Topping topping) {
        if (this.toppings < this.maxToppings) {
            switch (this.toppings) {
                case 0:
                    this.topping1 = topping;
                    break;
                case 1:
                    this.topping2 = topping;
                    break;
                case 2:
                    this.topping3 = topping;
                    break;
                case 3:
                    this.topping4 = topping;
                    break;
                default:
                    System.out.println("error in method addTopping");
            }
            // add topping to total count
            toppings += 1;
            // let user know topping was added
            System.out.println(topping.getName() + " has been added to your order.");
        } else {
            System.out.println("You have exceeded your topping limit.");
            System.out.println(topping.getName() + " cannot be added.");
        }
    }

    // displayPrice: show itemized and total
    public void displayPrice() {
        System.out.println("\nPrinting receipt...");
        // base price
        System.out.println(this.getName() +
                ", " + this.meat +
                ", " + this.bun + " bun: " +
                String.format("$%.2f", this.price));
        // topping price(s)
        if (this.topping1 != null) System.out.println(topping1.getName() + " : " + topping1.displayPrice());
        if (this.topping2 != null) System.out.println(topping2.getName() + " : " + topping2.displayPrice());
        if (this.topping3 != null) System.out.println(topping3.getName() + " : " + topping3.displayPrice());
        if (this.topping4 != null) System.out.println(topping4.getName() + " : " + topping4.displayPrice());
        // total price
        System.out.println("---------------");
        System.out.println("Total: " + String.format("$%.2f", calculatePrice()));
        System.out.println();
    }

    // calculatePrice
    public double calculatePrice() {
        double total = this.price;

        // add the topping prices
        if (this.topping1 != null) total += topping1.getPrice();
        if (this.topping2 != null) total += topping2.getPrice();
        if (this.topping3 != null) total += topping3.getPrice();
        if (this.topping4 != null) total += topping4.getPrice();

        return total;
    }

}
