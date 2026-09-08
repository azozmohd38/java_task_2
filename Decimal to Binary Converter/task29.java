
public class task29 {

    public static void main(String[] args) {

        // Declare and initialize the required variables

        int number = 25;

        int originalNumber = number;

        int remainder;

        String binary = "";

        // Loop to divide the number by 2 and store remainders

        while (number > 0) {

            // Find the remainder after dividing by 2

            remainder = number % 2;

            // Add the remainder to the beginning of the binary string
            binary = remainder + binary;

            // Divide the number by 2 for the next iteration
            number = number / 2;
        }

        // Display the original decimal number and binary result
        System.out.println("Decimal Number: " + originalNumber);
        System.out.println("Binary Number: " + binary);
    }
}
