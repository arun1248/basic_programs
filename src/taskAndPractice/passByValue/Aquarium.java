package taskAndPractice.passByValue;

public class Aquarium {

    String fishName;
    int quantity;

    Aquarium(String InfishName , int Inquantity)
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
