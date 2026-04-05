package tasks.arrayListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InventoryManager {
    static ArrayList<JewelryItem> jewels = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.add, 2.view, 3.update 4.remove 5.search 6.sort low-stock items 7.Calculate total inventory value");
        int input = Integer.parseInt(sc.nextLine());
        while(true)
        {
            switch (input){
                case 1:
                    addItems();
                    break;
                case 2:
                    viewLists();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    removeOutOfStock();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    checkLowStock();
                    break;
                case 7:
                    calcTotInventoryVal();
                    break;
                default:
                    System.out.println("Enter Valid input");
            }
            System.out.println("Press 1.add, 2.view, 3.update, 4.Out of stock, 5.search, 6.sort low-stock items, 7.Calculate total inventory value, 8.exit");
            input = Integer.parseInt(sc.nextLine());
            if(input == 8) {
                System.out.println("Exit....");
                break;
            }
        }
    }

    public static void addItems()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to add jewel? Yes or No");
        String input = sc.nextLine();
        while(input.equalsIgnoreCase("Yes"))
        {
            System.out.println("Enter Jewel Details");
            System.out.println("Enter Jewel Name");
            String name = sc.nextLine();
            System.out.println("Enter Jewel Type");
            String type = sc.nextLine();
            System.out.println("Enter Jewel Quantity");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Jewel Price");
            double pricePerGram = Double.parseDouble(sc.nextLine());
            JewelryItem jewel = new JewelryItem(name,type,quantity,pricePerGram);
            jewels.add(jewel);

            System.out.println("do you want to continue? Yes or No");
            input = sc.nextLine();
        }
    }
    public static void viewLists()
    {
        System.out.println("List of jewels: "+jewels);
    }
    public static void checkLowStock()
    {
        Collections.sort(jewels);
        System.out.println("List of jewels with lowStock(quantity < 10) ");
        for(int i = 0; i < jewels.size(); i++)
        {
            JewelryItem jewel = jewels.get(i);
            if(jewel.quantity < 10) System.out.println(jewel);
        }
    }
    public static void removeOutOfStock()
    {
        ArrayList<JewelryItem> outOfStockItem = new ArrayList<>();
        for(int i = 0; i < jewels.size(); i++) {
            JewelryItem jewel = jewels.get(i);
            if (jewel.quantity == 0) {
                outOfStockItem.add(jewel);
                jewels.remove(jewel);
            }
        }
        System.out.println("Out of stock items: "+outOfStockItem);
    }
    public static void update()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of jewel to be updated");
        String name = sc.nextLine();
        System.out.println("Enter the quantity to be updated");
        int quantity = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < jewels.size(); i++)
        {
            JewelryItem jewel = jewels.get(i);
            if(jewel.name.equalsIgnoreCase(name))
                jewel.quantity = quantity;
        }
        System.out.println("Jewel list after updation: "+jewels);
    }
    public static void search()
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter jewel name to be searched");
        String name = sc.nextLine();
        for(int i = 0; i < jewels.size(); i++) {
            JewelryItem jewel = jewels.get(i);
            if(jewel.name.equalsIgnoreCase(name)) {
                flag = true;
                break;
            }
        }
        //ToDo is it possible with contains
        if(flag)
            System.out.println(name+ " is present");
        else
            System.out.println(name+ " is not present");

    }
    public static void calcTotInventoryVal()
    {
        int totalVal = 0;
        int availableInventoryVal = 100;
        for(int i = 0; i < jewels.size(); i++) {
            JewelryItem jewel = jewels.get(i);
            totalVal = totalVal + jewel.quantity;
        }
        availableInventoryVal = availableInventoryVal - totalVal;
        if(availableInventoryVal > 0)
            System.out.println(availableInventoryVal+" Inventory is present");
        else
            System.out.println("Inventory is full");
    }
}


