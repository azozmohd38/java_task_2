
public class task22 {

    public static void main(String[] args) {

        int number = 12345;

        int reversedNumber = 0;

        int digit;

        // Store the original number for displaying later

        int originalNumber = number;

        // Loop to extract each digit and build the reversed number

        while (number != 0) {

            // Extract the last digit from the number

            digit = number % 10;

            // Add the digit to the reversed number

            reversedNumber = (reversedNumber * 10) + digit;

            // Remove the last digit from the original number
            number = number / 10;
        }

        // Display the original number and the reversed result
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}

