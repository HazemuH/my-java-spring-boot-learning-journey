public class OOPConcepts {

    /*
     Encapsulation:
        Definition: Encapsulation is one of the fundamental principles of OOP that involves bundling data (attributes) and methods (functions) that operate on that data into a single unit called a class.
        Purpose: Encapsulation helps hide the internal details of a class and provides a well-defined interface for interacting with it. It allows you to control access to the data by using access modifiers (e.g., private, public, protected) and getters/setters.
        Example: In the Person class, name and age are private attributes, and getter (getName) and setter (setAge) methods are provided to access and modify these attributes. This encapsulation prevents direct access to the name and enforces validation on the age.

     Inheritance:
        Definition: Inheritance is a mechanism that allows one class (subclass or child class) to inherit the properties and behaviors of another class (superclass or parent class).
        Purpose: Inheritance promotes code reusability and the creation of hierarchies of related classes. Subclasses can extend and specialize the functionality of the superclass.
        Example: The Student class inherits from the Person class, gaining access to its name and age attributes and displayInfo method. The Student class adds a studentId attribute and overrides the displayInfo method to include student-specific information.
     Polymorphism:
        Definition: Polymorphism allows objects of different classes to be treated as objects of a common superclass or interface. It enables flexibility in method invocation based on the actual type of the object at runtime.
        Purpose: Polymorphism simplifies code and promotes extensibility by allowing different objects to respond to the same method or interface in a way that is specific to their individual types.
        Example: The Shape interface defines a common method calculateArea. Both the Circle and Rectangle classes implement this interface and provide their own implementations of the calculateArea method. The code demonstrates calling the calculateArea method on objects of different types without knowing their specific classes.
     In summary:
        Encapsulation emphasizes data hiding and controlled access to attributes.
        Inheritance promotes code reuse and class hierarchy.
        Polymorphism allows objects of different types to be treated interchangeably based on a common interface.

    */


    public static void main(String[] args) {
        // Encapsulation Example
        Person person = new Person("Alice", 30);
        person.setAge(35); // Try to set an invalid age (won't work due to encapsulation)
        person.displayInfo();

        // Inheritance Example
        Student student = new Student("Bob", 20, "12345");
        student.displayInfo();

        // Polymorphism Example
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

// Encapsulation Example: Using a class to encapsulate data and behavior
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance Example: Creating a subclass
class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age); // Call the superclass constructor
        this.studentId = studentId;
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Student ID: " + studentId);
    }
}

// Polymorphism Example: Using a common interface
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}


