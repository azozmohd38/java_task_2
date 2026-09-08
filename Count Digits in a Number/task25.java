
public class task25 {
    public static void main(String[] args) {

        // Declare and initialize the required variables
        int number = 123456;
        int count = 0;

        // Store the original number for displaying later
        int originalNumber = number;

        // Loop to process each digit of the number
        while (number != 0) {

            // Remove the last digit from the number
            number = number / 10;

            // Increase the count for each digit found
            count++;
        }

        // Display the original number and total number of digits
        System.out.println("Number: " + originalNumber);
        System.out.println("Number of digits: " + count);
    }
}