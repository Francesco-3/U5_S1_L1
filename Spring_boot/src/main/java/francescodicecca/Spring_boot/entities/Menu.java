package francescodicecca.Spring_boot.entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;
    private final List<Topping> toppings;
    private final List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void printMenu() {
        System.out.printf("\n%-60s %10s %15s\n", "Pizza", "Calories", "Price");
        pizzas.forEach(Pizza::printPizza);
        System.out.println();

        System.out.printf("%-60s %10s %15s\n", "Toppings", "Calories", "Price");
        toppings.forEach(Topping::printTopping);
        System.out.println();

        System.out.printf("%-60s %10s %15s\n", "Drinks", "Calories", "Price");
        drinks.forEach(Drink::printDrink);
    }
}
