
public class task26 {

    public static void main(String[] args) {

        // Declare and initialize the numbers to compare

        int[] numbers = {45, 67, 23, 89, 34};

        int largest = numbers[0];

        // Loop through the array to find the largest number

        for (int i = 1; i < numbers.length; i++) {

            // Update largest when a bigger number is found

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the largest number
        System.out.println("Largest Number: " + largest);
    }
}

