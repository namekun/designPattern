package strategy;

public class PayApplication {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item FROG = new Item("frog", 320000);
        Item F284 = new Item("f284", 580000);

        shoppingCart.addItem(F284);
        shoppingCart.addItem(FROG);

        shoppingCart.pay(new NaverPay("nhkim", "12345678", "123", "20220801"));
        shoppingCart.pay(new KakaoPay("namkun","q1w2e3r4", 1000000));
    }
}
