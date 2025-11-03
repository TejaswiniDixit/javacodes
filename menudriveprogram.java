package practiceproblem;
import java.util.*;
public class menudriveprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b1 = sc.nextInt();
                    System.out.println("Result = " + (a1 + b1));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b2 = sc.nextInt();
                    System.out.println("Result = " + (a2 - b2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int a3 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b3 = sc.nextInt();
                    System.out.println("Result = " + (a3 * b3));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int a4 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b4 = sc.nextInt();
                    if (b4 != 0) {
                        System.out.println("Result = " + ((double) a4 / b4));
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}
