package factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type, int price){
        if("Latte".equalsIgnoreCase(type)){
            return new Latte(type, price);
        } else if ("Americano".equalsIgnoreCase(type)) {
            return new Americano(type, price);
        } else {
            return new MixCoffee();
        }
    }
}
