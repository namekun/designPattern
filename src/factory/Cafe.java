package factory;

public class Cafe {
    public static void main(String[] args) {
        Coffee Latte = CoffeeFactory.getCoffee("Latte", 5000);
        Coffee Americano = CoffeeFactory.getCoffee("Americano", 4500);
        System.out.println(Americano);
        System.out.println(Latte);
    }
}
