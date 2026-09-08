
public class task24 {
    public static void main(String[] args) {

        // Declare and initialize the grades for three subjects
        double grade1 = 85;
        double grade2 = 90;
        double grade3 = 80;

        double average;
        String status;

        // Calculate the average grade
        average = (grade1 + grade2 + grade3) / 3;

        // Determine the student's performance using conditional statements
        if (average >= 90) {
            status = "Excellent";
        } else if (average >= 75) {
            status = "Good";
        } else if (average >= 60) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        // Display the grades, average, and final status
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average: " + average);
        System.out.println("Status: " + status);
    }
}
