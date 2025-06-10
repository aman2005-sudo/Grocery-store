import java.util.Scanner;

public class GroceryStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryStore store = new GroceryStore();
        String filename = "grocery_items.txt";

        store.loadFromFile(filename); // Load items from previous session

        while (true) {
            System.out.println("\n🛒 Grocery Store Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Display Items");
            System.out.println("4. Calculate Total");
            System.out.println("5. Save and Exit");
            System.out.print("Choose an option (1-5): ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine().trim();

                    int quantity = readInt(scanner, "Enter quantity: ");
                    double price = readDouble(scanner, "Enter price per unit: ");

                    store.addItem(name, quantity, price);
                    break;

                case "2":
                    System.out.print("Enter item name to delete: ");
                    name = scanner.nextLine().trim();
                    store.deleteItem(name);
                    break;

                case "3":
                    store.displayItems();
                    break;

                case "4":
                    store.calculateTotal();
                    break;

                case "5":
                    store.saveToFile(filename);
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
