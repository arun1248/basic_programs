package tasks.arrayListTask;

public class JewelryItem implements Comparable<JewelryItem>{

    String name, type;
    int quantity;
    double pricePerGram;
    double totalVal;

    public JewelryItem(String name, String type, int quantity, double pricePerGram) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.pricePerGram = pricePerGram;
        this.totalVal = pricePerGram*quantity;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    @Override
    public int compareTo(JewelryItem o) {
        if(this.quantity == o.quantity)
            return 0;
        else if(this.quantity > o.quantity)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "JewelryItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", pricePerGram=" + pricePerGram +
                ", totalVal=" + totalVal +
                '}';
    }
}
