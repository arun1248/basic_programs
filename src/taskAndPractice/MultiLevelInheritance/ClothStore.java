package taskAndPractice.MultiLevelInheritance;
public class ClothStore {
    String storeName;
    String address;
    public ClothStore(String storeName, String address) {
        this.storeName = storeName;
        this.address = address;
    }
    ClothStore()
    {

    }
    void display()
    {
        System.out.println("Store Name is : "+this.storeName);
        System.out.println("Store address : "+this.address);
        System.out.println("Welcome to our Shop...");
    }
}
