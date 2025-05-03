import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter the marks in each subject:");

        for (int i = 0; i < n; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total = total+arr[i];
        }

        int average = total / n;
        char Grade;

        if (average >= 90 && average <= 100) {
            Grade = 'O';
        } 
        
        else if (average >= 80 && average < 90) {
            Grade = 'A';
        } 
        
        else if (average >= 65 && average < 80) {
            Grade = 'B';
        } 
        
        else if (average >= 50 && average < 65) {
            Grade = 'C';
        } 
        
        else {
            Grade = 'F';
        }

        System.out.println("\nTotal Marks: " + total+"/"+(n*100));
        System.out.println("Average Mark: " + average+"/100");
        System.out.println("Secured Grade: " + Grade);
         
    }
}
