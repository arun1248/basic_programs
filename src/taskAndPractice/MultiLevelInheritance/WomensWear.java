package taskAndPractice.MultiLevelInheritance;

public class WomensWear extends ClothStore{

    public WomensWear(String storeName, String address)
    {
        super(storeName, address);
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("20% offers, Enjoy Shopping...");
    }
}
