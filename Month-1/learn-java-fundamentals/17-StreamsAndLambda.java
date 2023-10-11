import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndLambda {

    public static void main(String[] args) {
        // Lambda Expressions and Streams: Explore Java's functional programming capabilities

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using Lambda Expressions with Streams
        // 1. Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Map each number to its square
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Squared Numbers: " + squaredNumbers);

        // 3. Reduce to find the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (accumulator, number) -> accumulator + number);

        System.out.println("Sum of Numbers: " + sum);

        // 4. Using forEach to print each element
        System.out.print("Numbers: ");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        // 5. Count the number of elements
        long count = numbers.stream().count();
        System.out.println("Number of Elements: " + count);
    }
}