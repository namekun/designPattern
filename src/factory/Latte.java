package factory;

public class Latte extends Coffee {
    private final int price;
    private final String type;

    public Latte(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getType() {
        return type;
    }
}
