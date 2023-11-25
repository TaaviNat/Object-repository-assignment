import java.util.*;

public class PalindromeChecker {

    // Instance variables to store original input, transformed input, palindrome status, and reversed string.
    private String input;
    private String transformed;
    private boolean isPalindrome;
    private String reversed;

    // Constructor to initialize instance variables.
    public PalindromeChecker(String input, String transformed, boolean isPalindrome, String reversed) {
        this.input = input;
        this.transformed = transformed;
        this.isPalindrome = isPalindrome;
        this.reversed = reversed;
    }

    // Method to transform input by converting to lowercase and removing spaces, commas, and exclamation marks.
    public static String transformInput(String input) {
        String transformed = input.toLowerCase();
        transformed = transformed.replaceAll("\\s", ""); // Remove spaces
        transformed = transformed.replace(",", "");      // Remove commas
        transformed = transformed.replace("!", "");      // Remove exclamation marks
        return transformed;
    }

    // Method to check if a string is a palindrome.
    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Method to reverse a string.
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    // Main method to take user input, transform it, and check if it's a palindrome.
    public static void main(String[] args) {
        // Create a Scanner object to get user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string.
        System.out.println("Enter a string: ");

        // Read the user input.
        String input = scanner.nextLine();

        // Transform the input string.
        String transformed = transformInput(input);

        // Check if the transformed input is a palindrome.
        boolean isPalindrome = checkPalindrome(transformed);

        // Display the result based on whether it's a palindrome or not.
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }
}
