import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalMarks = 0.0;
        double percentage = 0.0;
        int totalSubjects = 6;

        for(int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            double marks = input.nextDouble();
            totalMarks += marks;
        }

        percentage = (totalMarks / (totalSubjects * 100.0)) * 100.0;
        System.out.println("Percentage marks: " + percentage + "%");

        input.close();
    }
}
