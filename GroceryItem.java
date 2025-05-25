public class GroceryItem {
    String name;
    int quantity;
    double price;
    GroceryItem next;

    public GroceryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}