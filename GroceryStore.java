import java.io.*;

public class GroceryStore {
    private GroceryItem head;

    public void addItem(String name, int quantity, double price) {
        GroceryItem newItem = new GroceryItem(name, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            GroceryItem current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }

    public void deleteItem(String name) {
        if (head == null) {
            System.out.println("No items to delete.");
            return;
        }

        if (head.name.equalsIgnoreCase(name)) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }

        GroceryItem current = head;
        while (current.next != null && !current.next.name.equalsIgnoreCase(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Item deleted.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayItems() {
        GroceryItem current = head;
        if (current == null) {
            System.out.println("No items in the cart.");
            return;
        }

        System.out.println("\nItems in cart:");
        while (current != null) {
            System.out.printf("Name: %s | Quantity: %d | Price: %.2f | Total: %.2f%n",
                    current.name, current.quantity, current.price, current.getTotalPrice());
            current = current.next;
        }
    }

    public void calculateTotal() {
        GroceryItem current = head;
        double total = 0;
        while (current != null) {
            total += current.getTotalPrice();
            current = current.next;
        }
        System.out.printf("Total bill: %.2f%n", total);
    }

    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            GroceryItem current = head;
            while (current != null) {
                writer.write(current.name + "," + current.quantity + "," + current.price + "\n");
                current = current.next;
            }
            System.out.println("Items saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving items: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int quantity = Integer.parseInt(parts[1]);
                    double price = Double.parseDouble(parts[2]);
                    addItem(name, quantity, price);
                }
            }
            System.out.println("Items loaded from file.");
        } catch (IOException e) {
            System.out.println("No saved items found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data in file.");
        }
    }
}