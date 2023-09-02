package PIZZABAMBI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Topping pollo = new Topping("Pollo", 12.0);
        Topping pastron = new Topping("Camaron", 40.0);
        Topping jam = new Topping("Jamon",10.0);
        Topping bolP = new Topping("Bolitas de Pollo", 20.0);
        Topping pimieor = new Topping("Pastor",25.0);
        Topping camantos = new Topping("Pimientos", 7.0);
        Topping pina = new Topping("Pin;a",10.0);
        Topping tomate = new Topping("Tomate", 5.0);
        Topping cebolla = new Topping("Cebolla", 10.0);
        Topping pepperoni = new Topping("Peperoni", 15.0);
        Topping extraques = new Topping("Queso Extra", 10.0);
        Topping asada = new Topping("Carne Asada", 30.0);


        Pizza pizza = new Pizza("ESPECIAL", 100.0);
        System.out.println("\n==========BIENVENIDO A PIZZERIA BAMBINO===========");
        System.out.println("\t\t\tLA MEJOR PIZZA DE ORIENTE");
        sleep(3000);
        System.out.println("\nEl Precio de la pizza es: Q. " +pizza.basePrice);
        System.out.println("la cual unicamente contiene salsa y queso");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion puedas agregar mas ingredientes a tu Pizza");
        System.out.println("en donde se incluiran el precio extra a tu total");
        sleep(3000);
        System.out.println("\nOPCIONES DE INGREDIENTES:");
        System.out.println("1. Pollo");
        System.out.println("2. Pastor");
        System.out.println("3. Camaron");
        System.out.println("4. Jamon");
        System.out.println("5. Bolitas de Pollo");
        System.out.println("6. Pimientos");
        System.out.println("7. Pina");
        System.out.println("8. Tomate");
        System.out.println("9. Cebolla");
        System.out.println("10. Peperoni");
        System.out.println("11. Queso Extra");
        System.out.println("12. Carne Asada");
        System.out.println("0. Terminado");

        List<Topping> selectedToppings = new ArrayList<>();
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= 12) {
                Topping selectedTopping = null;
                switch (choice) {
                    case 1:
                        selectedTopping = pollo;
                        break;
                    case 2:
                        selectedTopping = pastor;
                        break;
                    case 3:
                        selectedTopping = camaron;
                        break;
                    case 4:
                        selectedTopping = jam;
                        break;
                    case 5:
                        selectedTopping = bolP;
                        break;
                    case 6:
                        selectedTopping = pimientos;
                        break;
                    case 7:
                        selectedTopping = pina;
                        break;
                    case 8:
                        selectedTopping = tomate;
                        break;
                    case 9:
                        selectedTopping = cebolla;
                        break;
                    case 10:
                        selectedTopping = pepperoni;
                        break;
                    case 11:
                        selectedTopping = extraques;
                        break;
                    case 12:
                        selectedTopping = asada;
                        break;
                }
                selectedToppings.add(selectedTopping);
                System.out.println(selectedTopping.getName() + " Agregado.");
            } else {
                System.out.println("Opcion incorrecta.");
            }
        }

        pizza.getToppings().addAll(selectedToppings);

        System.out.println("Tu Orden:");
        System.out.println(pizza);

        System.out.print("Ingresa tu pago ");
        double paymentAmount = scanner.nextDouble();
        double totalPrice = pizza.calculateTotalPrice();

        if (paymentAmount >= totalPrice) {
            double change = paymentAmount - totalPrice;
            System.out.println("Pago aceptado. Este es tu cambio: " + change);
            System.out.println("Preparando tu Pizza...");

            sleep(5000);
            System.out.println("Tu pizza esta lista!!!");
            // Simulando la preparacion de la pizza
        } else {
            System.out.println("Pago denegado. Tu pizza no sera preparada.");
        }
    }
}