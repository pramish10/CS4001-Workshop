import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        double grade = sc.nextDouble();

        // Ternary operator: condition ? value_if_true : value_if_false
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Output with escape sequences
        System.out.println("Grade Evaluation Result");
        System.out.println("-----------------------");
        System.out.println("Your grade: " + grade);
        System.out.println("Status: " + result);

        sc.close();
    }
}