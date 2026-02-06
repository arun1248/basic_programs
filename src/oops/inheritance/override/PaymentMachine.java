package oops.inheritance.override;

public class PaymentMachine {

    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment("11", 200, "111");
        upi.process();

        CardPayment card = new CardPayment("22", 2000, "222");
        card.isOfferAvailable();
        card.process();
//        System.out.println(card.paymentId);

        // child object is also a parent object
        boolean cardObject = upi instanceof UPIPayment;
        boolean paymentObject = upi instanceof Payment;

        System.out.println(cardObject);
        System.out.println(paymentObject);

        Payment pay = new Payment("33", 300, "333");
//        pay.amount;
    }
}
