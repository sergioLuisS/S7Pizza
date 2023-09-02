package PIZZABAMBI;

public class Topping {
    public String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

