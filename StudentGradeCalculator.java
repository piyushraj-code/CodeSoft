import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 1; i <= n; i++){
            System.out.println("Enter marks of subject"+i);
            marks[i-1] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        double precntage = totalMarks/n;
        System.out.println("Your total marks is: " + totalMarks);
        System.out.println("Your socred: "+ precntage +"%");
    }
}
