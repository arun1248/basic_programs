package taskAndPractice.passByValue;

public class Main {

    public static void main(String args[])
    {
        Aquarium angelFish = new Aquarium("Angel Fish", 4);
        angelFish.display();
        Aquarium tetra = new Aquarium("Tetra Fish", 6);
        tetra.display();

        Aquarium fighter = new Aquarium("Fighter", 2);
        fighter.display();
        Main obj = new Main();
        obj.addFish(fighter, 2);
        System.out.println("After adding extra fish");
        fighter.display();
    }

    void addFish(Aquarium obj, int quantityAdd)
    {
        obj.quantity = obj.quantity + quantityAdd;
    }
}
