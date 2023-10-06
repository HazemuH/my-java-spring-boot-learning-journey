public class ClassAndObjects {
    public static void main(String[] args) {
        // Create Cat objects and initialize them using constructors
        Cat cat1 = new Cat("Charlie", 5, "meooowwwww meowwww");
        Cat cat2 = new Cat("George", 3, "mauuuww mauuwww");

        System.out.println("I have a Cat named: " + cat1.getName());
        System.out.println("His weight is " + cat1.getWeight() + " kg");
        System.out.println("And he makes a sound like " + cat1.getSounds());

        System.out.println();

        System.out.println("My 2nd Cat named: " + cat2.getName());
        System.out.println("His weight is " + cat2.getWeight() + " kg");
        System.out.println("And he makes a sound like " + cat2.getSounds());

        System.out.println();

        System.out.println("I love " + cat1.getName() + " & " + cat2.getName());
    }
}

public class Cat {
    private String name;
    private int weight;
    private String sounds;

    public Cat(String name, int weight, String sounds) {
        this.name = name;
        this.weight = weight;
        this.sounds = sounds;
    }

    // Getter methods
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