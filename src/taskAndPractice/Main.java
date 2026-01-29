package taskAndPractice;

public class Main {

    public static void main(String args[])
    {
        aquarium angelFish = new aquarium("Angel Fish", 4);
        angelFish.display();
        aquarium tetra = new aquarium("Tetra Fish", 6);
        tetra.display();

        aquarium fighter = new aquarium("Fighter", 2);
        fighter.display();
        Main obj = new Main();
        obj.addFish(fighter, 2);
        System.out.println("After adding extra fish");
        fighter.display();
    }

    void addFish(aquarium obj, int quantityAdd)
    {
        obj.quantity = obj.quantity + quantityAdd;
    }
}
