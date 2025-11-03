package dhani;
import java.util.*;
public class ContinousCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char cont;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /, %): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+' -> System.out.println("Result = " + (a + b));
                case '-' -> System.out.println("Result = " + (a - b));
                case '*' -> System.out.println("Result = " + (a * b));
                case '/' -> {
                    if (b != 0) System.out.println("Result = " + (a / b));
                    else System.out.println("Error! Division by zero.");
                }
                case '%' -> {
                    if (b != 0) System.out.println("Result = " + (a % b));
                    else System.out.println("Error! Modulo by zero.");
                }
                default -> System.out.println("Invalid operator!");
            }

            System.out.print("Do you want to continue? (y/n): ");
            cont = sc.next().toLowerCase().charAt(0);
        } while (cont == 'y');

	}

}
