package tasks.oops_task;

import java.util.ArrayList;

public class Order {

    int orderId;
    Product[] products;
    Customer customer;
    ArrayList productsSc = new ArrayList();

    public Order(int orderId, Customer customer, Product[] products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public Order(int orderId, Customer customer, ArrayList products) {
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
            Product product = (Product)productsSc.get(i);
            total = total + product.price;
        }
        return total;
    }
}
