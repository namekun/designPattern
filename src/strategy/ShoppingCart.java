package strategy;

import java.util.*;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotalPrice(){
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotalPrice();
        paymentStrategy.pay(amount);
    }
}
