package HW_42.task_3;

public class Purchase {
    private String itemName;
    private double price;

    public Purchase(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
