package factory;

public class MixCoffee extends Coffee {
    private final int price;
    private final String type;

    public  MixCoffee() {
        this.price = 3000;
        this.type = "Mix Coffee";
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
