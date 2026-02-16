package oops.polymorphism;

public class MethodHiding {

    public static void main(String[] args) {
        Animal superRef = new Animal();
        Cat subRef = new Cat();
        Animal polyRef = new Cat();

        // Calls the Animal version because the reference type is Animal
        superRef.makeSound();

        // Calls the Cat version because the reference type is Cat
        subRef.makeSound();

        // Still calls the Animal version (based on the reference type 'Animal' at compile time)
        polyRef.makeSound();

        // This is the preferred way to call static methods, explicitly on the class name
        Animal.makeSound();
        Cat.makeSound();
    }
}

class Animal {
    public static void makeSound() {
        System.out.println("The static method in Animal");
    }
}

class Cat extends Animal {
    // This method hides the makeSound() in the Animal class
    public static void makeSound() {
        System.out.println("The static method in Cat");
    }
}
