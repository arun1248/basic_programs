package tasks.oops_task_generics.oops_task;

import java.util.ArrayList;

public class Order {

    int orderId;
    Product[] products;
    Customer customer;
    ArrayList<Product> productsSc = new ArrayList<Product>();

    public Order(int orderId, Customer customer, Product[] products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public Order(int orderId, Customer customer, ArrayList<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.productsSc = products;
    }

    float calculateTotal()
    {
        float total = 0;
        for(int i = 0; i < products.length ; i++)
        {
             total = total + products[i].price;
        }
        return total;
    }

    float calcTotal()
    {
        float total = 0;
        for(int i = 0; i < productsSc.size() ; i++)
        {
            Product product = productsSc.get(i);
            total = total + product.price;
        }
        return total;
    }
}
