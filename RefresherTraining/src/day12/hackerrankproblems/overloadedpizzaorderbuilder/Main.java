package day12.hackerrankproblems.overloadedpizzaorderbuilder;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Small");

        Pizza pizza2 = new Pizza("Medium", "Thin");

        Pizza pizza3 = new Pizza("Large", "Cheese", 3);

        Pizza pizza4 = new Pizza("Medium", "Regular", 2, 500);

        pizza1.displayPizza();
        pizza2.displayPizza();
        pizza3.displayPizza();
        pizza4.displayPizza();
    }
}