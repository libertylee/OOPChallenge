package com.timbuchalka;

public class HealthyBurger extends BillsBurger {
    // up to 6 toppings
    private Topping topping5;
    private Topping topping6;

    public HealthyBurger(double price, String meat) {
        super(price, meat, "brown rye");
        this.setName("Healthy Burger");
        this.setMaxToppings(6);
    }

    @Override
    public void addTopping(Topping topping) {
        if (this.getToppings() < this.getMaxToppings()) {
            switch (this.getToppings()) {
                case 0:
                    this.setTopping1(topping);
                    break;
                case 1:
                    this.setTopping2(topping);
                    break;
                case 2:
                    this.setTopping3(topping);
                    break;
                case 3:
                    this.setTopping4(topping);
                    break;
                case 4:
                    this.topping5 = topping;
                    break;
                case 5:
                    this.topping6 = topping;
                    break;
                default:
                    System.out.println("error in method addTopping");
            }
            // add topping to total count
            incrementToppings();
            // let user know topping was added
            System.out.println(topping.getName() + " has been added to your order.");
        } else {
            System.out.println("You have exceeded your topping limit.");
            System.out.println(topping.getName() + " cannot be added.");
        }
    }

    @Override
    public void displayPrice() {
        System.out.println("\nPrinting receipt...");
        // base price
        System.out.println(this.getName() +
                ", " + this.getMeat() +
                ", " + this.getBun() + " bun: " +
                String.format("$%.2f", this.getPrice()));

        // topping price(s)
        if (this.getTopping1()!= null) System.out.println(getTopping1().getName() + " : " + getTopping1().displayPrice());
        if (this.getTopping2()!= null) System.out.println(getTopping2().getName() + " : " + getTopping2().displayPrice());
        if (this.getTopping3()!= null) System.out.println(getTopping3().getName() + " : " + getTopping3().displayPrice());
        if (this.getTopping4()!= null) System.out.println(getTopping4().getName() + " : " + getTopping4().displayPrice());
        if (this.topping5 != null) System.out.println(topping5.getName() + " : " + topping5.displayPrice());
        if (this.topping6 != null) System.out.println(topping6.getName() + " : " + topping6.displayPrice());
        // total price
        System.out.println("---------------");
        System.out.println("Total: " + String.format("$%.2f", calculatePrice()));
        System.out.println();
    }

    // calculatePrice
    public double calculatePrice() {
        double total = super.calculatePrice();
        if (this.topping5 != null) total += topping5.getPrice();
        if (this.topping6 != null) total += topping6.getPrice();
        return total;
    }
}
