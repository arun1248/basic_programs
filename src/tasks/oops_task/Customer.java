package tasks.oops_task;

public class Customer extends User{

    String address;

    public Customer(int userId, String name, String address) {
        super(userId, name);
        this.address = address;
    }

    @Override
    void displayInfo() {
        System.out.println("Customer class");
    }

    void placeOrder(Order order)
    {
        System.out.println("Order is placed");
    }

    void payment()
    {
        System.out.println("Payment is successful");
    }
}
