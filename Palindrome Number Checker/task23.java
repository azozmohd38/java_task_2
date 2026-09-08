
public class task23 {

    public static void main(String[] args) {

        // Declare and initialize the required variables

        int number = 1221;

        int originalNumber = number;

        int reversedNumber = 0;

        int digit;

        // Loop to reverse the digits of the number
        while (number != 0) {

            // Extract the last digit
            digit = number % 10;

            // Build the reversed number
            reversedNumber = (reversedNumber * 10) + digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Display the original number
        System.out.println("Number: " + originalNumber);

        // Compare the reversed number with the original number
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }
}
