package tasks.oops_task;

public class Admin extends User {

    public Admin(int userId, String name) {
        super(userId, name);
    }

    void addProduct(Product product)
    {
        System.out.println("product.productId :"+product.productId+" product.name :"+product.name+ " product.price :"+product.price);
    }

    @Override
    void displayInfo() {
        System.out.println("Admin Class display");
    }
}
