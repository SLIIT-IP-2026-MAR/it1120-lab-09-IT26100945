import java.util.Scanner;

public class IT26100945Lab9Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Name of Student " + i + ": ");
            String name = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double exam = sc.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.3) + (exam * 0.7);
    }

    public static String findGrades(double mark) {
        if (mark >= 75) return "A";
        else if (mark >= 60) return "B";
        else if (mark >= 50) return "C";
        else return "F";
    }

    public static void printDetails(String name, double mark, String grade) {
        System.out.println(name + " " + mark + " " + grade);
    }
}