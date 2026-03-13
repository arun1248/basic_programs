package tasks.oops_task;

public class ShopRunnerWoSc {

    public static void main(String[] args) {

        Product product1 = new Product(1,"Kurti",500);
        Product product2 = new Product(2,"Leggins",200);
        Product product3 = new Product(3,"Jeans",1000);
        Product product4 = new Product(4,"T-Shirt",250);

        Product[] products = {product1,product2,product3,product4};

        Customer customer = new Customer(199, "Nazrin Banu","coimbatore");

        Order order = new Order(1234, customer, products);

        System.out.println(order.calculateTotal());

    }
}
