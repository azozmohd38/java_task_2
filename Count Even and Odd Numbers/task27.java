public class task27 {
    public static void main(String[] args) {

        // Declare and initialize the range variables
        int start = 1;
        int end = 10;

        int evenCount = 0;
        int oddCount = 0;

        // Loop through each number in the given range
        for (int i = start; i <= end; i++) {

            // Check whether the number is even or odd
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the total count of even and odd numbers
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}
