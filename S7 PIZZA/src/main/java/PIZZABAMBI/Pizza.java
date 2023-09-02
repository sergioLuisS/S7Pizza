package PIZZABAMBI;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    double basePrice;
    private List<Topping> toppings = new ArrayList<>();

    // Constructor
    public Pizza(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        for (Topping to : toppings) {
            this.toppings.add(to);
        }
    }
    public double calculateTotalPrice() {
        double totalPrice = basePrice;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }
    @Override
    public String toString() {
        return "Pizza: " + name + "Precio : " + calculateTotalPrice();
    }

    public <E> List<E> getToppings() {
        return (List<E>) toppings;
    }
}

