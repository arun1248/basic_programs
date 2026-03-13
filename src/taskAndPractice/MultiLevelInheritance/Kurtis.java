package taskAndPractice.MultiLevelInheritance;

public class Kurtis extends WomensWear{
    String customerName;
    String kurtiSize;
    Kurtis(String storeName, String address,  String customerName, String kurtiSize)
    {
        super(storeName, address);
        this.customerName = customerName;
        this.kurtiSize = kurtiSize;
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("Thanks! "+customerName+" Visit us again...");
    }
}
