package tasks.oops_task_generics.oops_task;

public class UPIPayment extends Payment {

    String upiId;

   public UPIPayment(String upiId) {
        this.upiId = upiId;
    }


    @Override
    boolean pay(float amount, float estAmount) {
        return amount == estAmount;
    }


}
