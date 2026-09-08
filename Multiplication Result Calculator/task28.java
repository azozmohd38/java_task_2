
public class task28 {

    public static void main(String[] args) {

        // Declare and initialize the required variables

        int start = 1;

        int end = 5;
        int result = 1;

        // Loop through the range and multiply each number step by step
        for (int i = start; i <= end; i++) {

            // Multiply the current result by the loop value
            result = result * i;
        }

        // Display the final multiplication result
        System.out.println("Multiplication Result: " + result);
    }
}
