package francescodicecca.Spring_boot.entities;

public class Drink extends Item {
    public Drink(String name, int calories, double price) { super(name, calories, price); }

    @Override
    public void printDrink() { System.out.printf("\n%-60s %10s %15s\n", name, calories, price); }
}
