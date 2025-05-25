import java.util.Scanner;

public class GroceryStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryStore store = new GroceryStore();
        String filename = "grocery_items.txt";

        store.loadFromFile(filename); // Load saved items

        while (true) {
            System.out.println("\nGrocery Store Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Display Items");
            System.out.println("4. Calculate Total");
            System.out.println("5. Save and Exit");
            System.out.print("Choose an option: ");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter price per unit: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    store.addItem(name, quantity, price);
                    break;
                case 2:
                    System.out.print("Enter item name to delete: ");
                    name = scanner.nextLine();
                    store.deleteItem(name);
                    break;
                case 3:
                    store.displayItems();
                    break;
                case 4:
                    store.calculateTotal();
                    break;
                case 5:
                    store.saveToFile(filename);
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}