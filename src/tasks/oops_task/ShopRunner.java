package tasks.oops_task;

import oops.inheritance.override.CardPayment;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopRunner {

    public static void main(String[] args) {

        int userId = 0;
        String name = null;
        String address = null;

        Scanner sc = new Scanner(System.in);
        ArrayList products = new ArrayList();
        Admin admin = new Admin(userId,name);
        Customer customer = new Customer(userId,name,address);

        getProductsFromUser(sc,products);
        getAdminFromUser(sc, admin);
        getCustomerFromUser(sc, customer);

        ArrayList cusProduct = new ArrayList();
        System.out.println("Proceed to buy.... ");
        while(true)
        {
            System.out.println("Please enter the product id :");
            int productId = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < products.size(); i++)
            {
                Product product = (Product)products.get(i);
                if(productId == product.productId)
                {
                    cusProduct.add(products.get(i));
                }
            }
            System.out.println("do you want to continue? Yes or No");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("No")) {
                break;
            }
        }
        Order order = new Order(1, customer, cusProduct);
        float estAmount = order.calcTotal();
        System.out.println("Estimated amount = "+estAmount);

        System.out.println("Press 1 for UPI Payment");
        System.out.println("Press 2 for CreditCard Payment");

        int option = Integer.parseInt(sc.nextLine());
        int amount;
        switch (option) {
            case 1: UPIPayment upi = new UPIPayment("1245");
                System.out.println("Enter amount");
                amount = Integer.parseInt(sc.nextLine());
                if(upi.pay(amount, estAmount))
                    System.out.println("Payment is successful.....");
                else
                    System.out.println("Payment not success. Please check again.....");
                break;

            case 2:
                CreditCardPayment card = new CreditCardPayment("abc123");
                System.out.println("Enter amount");
                amount = Integer.parseInt(sc.nextLine());
                if(card.pay(amount,estAmount))
                    System.out.println("Payment is successful.....");
                else
                    System.out.println("Payment not success. Please check again.....");
                break;
            default :
                System.out.println("Please enter valid option...");
        }
        sc.close();
    }
    public static void getProductsFromUser(Scanner sc, ArrayList products)
    {
        String name;

        while(true) {
            System.out.println("Enter product details");
            System.out.println("Enter productId");
            int productId = Integer.parseInt(sc.nextLine());
            System.out.println("Enter product name");
            name = sc.nextLine();
            System.out.println("Enter product price");
            float price = Float.parseFloat(sc.nextLine());

            Product product = new Product(productId, name, price);
            products.add(product);

            System.out.println("do you want to continue? Yes or No");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("No")) {
                break;
            }
        }
    }
    public static void getAdminFromUser(Scanner sc, Admin admin)
    {
        System.out.println("Enter admin details");
        System.out.println("Enter admin userId");
        int userId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter admin name");
        String name = sc.nextLine();
        admin = new Admin(userId, name);
    }
    public static void getCustomerFromUser(Scanner sc, Customer customer)
    {
        System.out.println("Enter Customer details");
        System.out.println("Enter customer userId");
        int userId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter customer name");
        String name = sc.nextLine();
        System.out.println("Enter customer address");
        String address = sc.nextLine();
        customer = new Customer(userId,name,address);
    }
}





