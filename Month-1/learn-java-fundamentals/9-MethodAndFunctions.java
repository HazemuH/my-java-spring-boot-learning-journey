public class MethodAndFunctions {
    // A method with no parameters and no return value (void).
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    // A method that takes two integers as parameters and returns their sum.
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method overloading: An overloaded method to add three integers.
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method overriding: Animal and Dog classes.
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks.");
        }
    }

    public static void main(String[] args) {
        // Calling the sayHello() method.
        sayHello();

        // Calling the add() method with two integers.
        int result1 = add(5, 7);
        System.out.println("The sum of two numbers is: " + result1);

        // Calling the add() method with three integers.
        int result2 = add(3, 6, 9);
        System.out.println("The sum of three numbers is: " + result2);

        // Method overriding example.
        Animal animal = new Dog(); // Polymorphism: Animal reference, Dog object
        animal.makeSound(); // Calls the overridden method in Dog class
    }
}
