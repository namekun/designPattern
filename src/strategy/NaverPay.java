package strategy;

public class NaverPay implements PaymentStrategy {
    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String expireDate;

    public NaverPay(String name, String cardNumber, String cvv, String expireDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " won paid by naver pay");
    }
}
