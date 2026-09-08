public class task32 {
    public class ArmstrongNumberChecker {

        public static void main(String[] args) {

            // Set the input number before starting the calculation
            int number = 153;
            int originalNumber = number;
            int digit;
            int sum = 0;
            int count = 0; // stores the total number of digits

            // Count digits so each digit uses the correct exponent
            while (number > 0) {
                number = number / 10;
                count++;
            }

            // Restore the input after counting its digits
            number = originalNumber;

            // Recalculate the sum using every original digit
            while (number != 0) {

                // Extract the last digit
                digit = number % 10;

                // Add the digit raised to the power of digit count
                sum += (int) Math.pow(digit, count);

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
