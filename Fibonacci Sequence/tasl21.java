
public class tasl21 {

    public static void main(String[] args) {

        int first = 0;

        int second = 1;

        int next;

        // Display the first two numbers

        System.out.println(first + " " + second + " ");


        for (int count = 3; count <= 15; count++) {

            // Calculate the next Fibonacci number

            next = first + second;

            // Display the next number

            System.out.print(next + " ");

            // Update the previous two numbers for the next iteration
            first = second;
            second = next;


        }
    }

    }
