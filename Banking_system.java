package dhani;
import java.util.*;
public class Banking_system {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double balance = 10000.0;

        System.out.println("=== Banking Menu ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Transfer Funds");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Your Balance: ₹" + balance);

            case 2 -> {
                System.out.println("Choose Account Type:");
                System.out.println("1. Savings");
                System.out.println("2. Current");
                int subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1 -> System.out.println("Transfer from Savings successful.");
                    case 2 -> System.out.println("Transfer from Current successful.");
                    default -> System.out.println("Invalid account type!");
                }
            }

            case 3 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice!");
        }

	}

}
