package oops.inheritance.override;

public class Payment {

    String transactionId; // package private
    private double amount;
    protected String paymentId; // package private + subclass access

    public Payment(String transactionId, double amount, String paymentId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentId = paymentId;
    }

    void process() {
        System.out.println("processing..."+amount);
        System.out.println("paid");
        printReceipt();
    }

    final void printReceipt() {
        System.out.println("printing receipt...");
    }
}
