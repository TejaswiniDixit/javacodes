package dhani;
import java.util.*;
public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int marks;

        do {
            System.out.print("Enter marks (0–100): ");
            marks = sc.nextInt();
        } while (marks < 0 || marks > 100);

        switch (marks / 10) {
            case 10, 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            default -> System.out.println("Grade: Fail");
        }

	}

}
