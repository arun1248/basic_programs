package tasks.oops_task;

public class UPIPayment extends Payment{

    String upiId;

   public UPIPayment(String upiId) {
        this.upiId = upiId;
    }


    @Override
    boolean pay(float amount, float estAmount) {
        if(amount == estAmount)
            return true;
        else
            return false;
    }


}
