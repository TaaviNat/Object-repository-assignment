import java.util.Scanner;

public class PalindromeChecker {

    // Main method to test the checker
    public static void main(String[] args) {

        // Prompt for word/phrase and scan it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or a phrase: ");
        String input = scanner.nextLine();

        // Call for transform to remove other than letters
        String transformed = transformInput(input);

        // Call to check if transformed input is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Print based on result
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    // Removing everything else than letters and make it lowercase
    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(" ", "");
        input = input.replace(".", "");
        input = input.replace(",", "");
        input = input.replace("!", "");
        input = input.replace("?", "");
        return input;
    }

    // Compare reversed string to original
    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    // Reverses the string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}