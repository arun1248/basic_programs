package oops.inheritance.override;

public class UPIPayment extends Payment {
    public UPIPayment(String transactionId, double amount, String paymentId) {
        super(transactionId, amount, paymentId);
    }

    @Override // annotation
    void process() {
        System.out.println("Scan the QR");
        super.process();
    }

}
