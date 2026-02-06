package oops.inheritance.override;

public class CardPayment extends Payment {
    public CardPayment(String transactionId, double amount, String paymentId) {
        super(transactionId, amount, paymentId);
    }

    @Override
    void process() {
        System.out.println("Insert Card");
        System.out.println("payment id "+super.paymentId);
        super.process();
    }

    boolean isOfferAvailable() {
        System.out.println("Offer is available for "+super.transactionId);
        return true;
    }

}
