public class StringManipulations {
    public static void main(String[] args) {
        // String Concatenation
        // String concatenation is the process of combining two or more strings into a single string.
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Substring Extraction
        String sentence = "This is a sample sentence.";
        String substring = sentence.substring(5, 15);
        System.out.println("Substring: " + substring);

        // String Length
        String text = "Hello, Java!";
        int length = text.length();
        System.out.println("String Length: " + length);

        // Character Extraction
        // A substring is a portion of a string that is extracted from the original string.
        char firstChar = text.charAt(0);
        System.out.println("First Character: " + firstChar);

        // String Comparison
        String str1 = "apple";
        String str2 = "apples";
        boolean isEqual = str1.equals(str2);
        System.out.println("String Comparison: " + isEqual);

        // Searching and Matching
        String searchIn = "The quick brown fox jumps over the lazy dog.";
        boolean containsFox = searchIn.contains("fox");
        int indexOfFox = searchIn.indexOf("fox");
        int lastIndexOfFox = searchIn.lastIndexOf("fox");
        System.out.println("Contains 'fox': " + containsFox);
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println("Last Index of 'fox': " + lastIndexOfFox);

        // String Modification
        String originalText = "  Trim me!  ";
        String trimmedText = originalText.trim();
        String replacedText = originalText.replace("Trim", "Replace");
        System.out.println("Trimmed Text: '" + trimmedText + "'");
        System.out.println("Replaced Text: '" + replacedText + "'");

        // String Formatting
        int age = 30;
        double salary = 50000.50;
        String formattedString = String.format("Age: %d, Salary: %.2f", age, salary);
        System.out.println("Formatted String: " + formattedString);

        // String Splitting
        String csvData = "John,Doe,30,New York";
        String[] csvFields = csvData.split(",");
        System.out.println("CSV Fields:");
        for (String field : csvFields) {
            System.out.println(field);
        }

        // Character Encoding and Decoding
        String utf8String = "UTF-8 Encoding and Decoding";
        byte[] utf8Bytes = utf8String.getBytes();
        String decodedString = new String(utf8Bytes);
        System.out.println("UTF-8 Decoded String: " + decodedString);
    }
}
