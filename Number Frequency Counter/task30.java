
public class task30 {


    public static void main(String[] args) {

        // Declare and initialize the required variables

        int number = 122333;
        int targetDigit = 3;
        int count = 0;
        int digit;

        // Store the original number for displaying later
        int originalNumber = number;

        // Loop to extract each digit from the number
        while (number != 0) {

            // Extract the last digit
            digit = number % 10;

            // Compare the extracted digit with the target digit
            if (digit == targetDigit) {
                count++;
            }

            // Remove the last digit from the number
            number = number / 10;
        }

        // Display the result
        System.out.println("Number: " + originalNumber);
        System.out.println("Target Digit: " + targetDigit);
        System.out.println("Frequency: " + count);
    }
}
