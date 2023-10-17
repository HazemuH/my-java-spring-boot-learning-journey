public class TryCatchFinally {
    public static void main(String[] args) {

        // In this session i want to learn about exceptions
        // handling on java so makes the program not exited when there's an error in it.

        /*
        - try Block:

        The try block is used to enclose a set of statements that might throw an exception.
        It is used to indicate the code that needs to be monitored for exceptions.
        If an exception occurs within the try block, the normal flow of the program is disrupted, and control is transferred to the catch block.

        - catch Block:

        The catch block follows a try block and is used to handle exceptions that occur within the try block.
        Each catch block specifies the type of exception it can handle (e.g., catch (ExceptionType e)).
        When an exception occurs, Java checks each catch block to see if it can handle the exception based on the type of exception it specifies.
        The first matching catch block is executed, and control flows into that block.
        Multiple catch blocks can be used to handle different types of exceptions or to provide different error-handling strategies.
        It is not required to have a catch block for every type of exception that can be thrown; however, it's a good practice to handle exceptions gracefully.

        - finally Block:

        The finally block is used to define a set of statements that will be executed regardless of whether an exception occurred or not.
        It is often used to perform cleanup tasks, such as closing files or releasing resources, that need to be executed regardless of exceptions.
        Even if an exception is thrown and caught or not caught at all, the finally block will be executed.
        The finally block is optional. You can have a try block without a finally block, but if you have a finally block, it must follow the catch block (if present).

        - In summary:
        - try is used to wrap the code where exceptions may occur.
        - catch is used to handle exceptions that occur in the try block.
        - finally is used for code that must be executed regardless of whether an exception occurred.

        */

        // Example 1: Handling Checked Exception (IOException)
        try {
            // Attempt to open a file that does not exist
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistentfile.txt");
        } catch (java.io.FileNotFoundException e) {
            // Catch the checked exception
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // Finally block is executed regardless of whether an exception occurred or not
            System.out.println("Exception handling for checked exception complete.\n");
        }

        // Example 2: Handling Unchecked Exception (ArithmeticException)
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempt to divide by zero
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            // Catch the unchecked exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exception handling for unchecked exception complete.\n");
        }

        // Example 3: Finally Block without Exception
        try {
            int number = 42 / 7;
            System.out.println("Result: " + number);
        } finally {
            System.out.println("Finally block without an exception.\n");
        }

        // Example 4: Multiple Catch Blocks (Handling Different Exceptions)
        try {
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Exception handling with multiple catch blocks complete.");
        }
    }
}
