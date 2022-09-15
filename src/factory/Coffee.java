package factory;

public abstract class Coffee {
    public abstract int getPrice();
    public abstract String getType();

    @Override
    public String toString(){
        return "주문하신 "+ this.getType() +"는 " + this.getPrice() + "원 입니다.";
    }
}
