package strategy;

public class KakaoPay implements PaymentStrategy{
    private final String kakaoId;
    private final String passWord;
    private final int balance;

    public KakaoPay(String kakaoId, String passWord, int balance) {
        this.kakaoId = kakaoId;
        this.passWord = passWord;
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " won paid by kakao pay, balance : " +  (balance-amount));
    }
}
