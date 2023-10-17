public class ClassAndObjects {
    public static void main(String[] args) {
        // This is the main entry point of the program.
        // It demonstrates the usage of objects and classes in Java.

        // Create Cat objects and initialize them using constructors
        Cat cat1 = new Cat("Charlie", 5, "meooowwwww meowwww");
        Cat cat2 = new Cat("George", 3, "mauuuww mauuwww");

        // Display information about the first cat
        System.out.println("I have a Cat named: " + cat1.getName());
        System.out.println("His weight is " + cat1.getWeight() + " kg");
        System.out.println("And he makes a sound like " + cat1.getSounds());

        System.out.println();

        // Display information about the second cat
        System.out.println("My 2nd Cat named: " + cat2.getName());
        System.out.println("His weight is " + cat2.getWeight() + " kg");
        System.out.println("And he makes a sound like " + cat2.getSounds());

        System.out.println();

        // Display a message expressing love for both cats
        System.out.println("I love " + cat1.getName() + " & " + cat2.getName());
    }
}

public class Cat {
    private String name;
    private int weight;
    private String sounds;

    // Constructor to initialize the Cat object
    public Cat(String name, int weight, String sounds) {
        this.name = name;
        this.weight = weight;
        this.sounds = sounds;
    }

    // Getter methods (Accessor Method) is to access the private members of the Cat class
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getSounds() {
        return sounds;
    }
}