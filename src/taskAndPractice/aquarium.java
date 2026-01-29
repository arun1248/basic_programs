package taskAndPractice;

public class aquarium {

    String fishName;
    int quantity;

    aquarium(String InfishName , int Inquantity)
    {
        fishName = InfishName;
        quantity = Inquantity;
    }

    void display()
    {
        System.out.println("Fish Name :"+fishName);
        System.out.println("Fish Quantity :"+quantity);
    }
}
