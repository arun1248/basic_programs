import oops.inheritance.override.Payment;

public class InternetBanking extends Payment {
    public InternetBanking(String transactionId, double amount, String paymentId) {
        super(transactionId, amount, paymentId);
        System.out.println(super.paymentId);
    }
}
