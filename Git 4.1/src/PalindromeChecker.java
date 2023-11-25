import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = transformInput(scanner.nextLine());

        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        int j = 0;
        int length = input.length();
        /* We only need to loop through half of the string
         * and for odd length strings, we can ignore the middle character.
         *
         * We compare the first and last characters
         * then the second and second to last characters
         * and so on and so forth.
         */
        for (int i = input.length() - 1; i >= length / 2; i--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            j++;
        }
        return true;
    }
}