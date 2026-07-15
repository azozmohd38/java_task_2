public class task32 {
    public class ArmstrongNumberChecker {

        public static void main(String[] args) {

            // Declare and initialize the required variables
            int number = 153;
            int originalNumber = number;
            int digit;
            int sum = 0;
            int count = 0;

            // Loop to count the number of digits
            while (number != 0) {
                number = number / 10;
                count++;
            }

            // Reset number to the original value for digit extraction
            number = originalNumber;

            // Loop to calculate the Armstrong value
            while (number != 0) {

                // Extract the last digit
                digit = number % 10;

                // Add the digit raised to the power of digit count
                sum = sum + (int) Math.pow(digit, count);

                // Remove the last digit from the number
                number = number / 10;
            }

            // Display the original number
            System.out.println("Number: " + originalNumber);

            // Compare the calculated sum with the original number
            if (sum == originalNumber) {
                System.out.println("The number is an Armstrong number.");
            } else {
                System.out.println("The number is not an Armstrong number.");
            }
        }
    }
}
