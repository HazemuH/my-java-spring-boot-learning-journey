public class EnumsAndConstants {

    // Enums are used to define a fixed set of related constant values and can have associated values for each constant.
    // Constants are variables whose values remain constant and are declared using the final keyword. They are typically used for values that should not change during program execution.

    // Constants
    public static final int MAX_VALUE = 100; // Constant declaration using 'final'

    public static void main(String[] args) {
        // Using Enum Constants
        Day today = Day.WEDNESDAY; // Assigning an enum constant to a variable
        System.out.println("Today is " + today); // Prints the enum constant name
        System.out.println("Display Name: " + today.getDisplayName()); // Accessing the associated value

        // Using Constants
        int value = 42;
        if (value <= MAX_VALUE) {
            System.out.println("Value is within the maximum limit.");
        } else {
            System.out.println("Value exceeds the maximum limit.");
        }
    }
}

// Enum Declaration: Defining an enumeration for days of the week
enum Day {
    // Enum Constants: List of constant values for days
    SUNDAY("Sunday"),     // Enum constant with an associated value
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    // Enum Constructor: Associated value for each enum constant
    private String displayName;

    // Constructor for the enum constants
    Day(String displayName) {
        this.displayName = displayName;
    }

    // Getter Method: Accessing the associated value
    public String getDisplayName() {
        return displayName;
    }
}
