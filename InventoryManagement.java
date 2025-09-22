package dhani;
import java.util.*;
public class InventoryManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    items.add(item);
                    System.out.println("Item added!");
                }
                case 2 -> {
                    System.out.print("Enter item name to delete: ");
                    String del = sc.nextLine();
                    if (items.remove(del))
                        System.out.println("Item deleted!");
                    else
                        System.out.println("Item not found!");
                }
                case 3 -> {
                    System.out.println("Inventory Items:");
                    if (items.isEmpty())
                        System.out.println("No items in inventory.");
                    else
                        for (String it : items)
                            System.out.println("- " + it);
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

	}

}
