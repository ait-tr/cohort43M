package code.HW42.Task3;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Purchase> products;
    private LocalDate data;

    public Order(LocalDate data) {
        this.products = new ArrayList<>();
        this.data = data;
    }
    public Order(LocalDate data, List<Purchase> products) {
        this.products = new ArrayList<>();
        this.data = data;
    }
    public List<Purchase> getProducts() {
        return products;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", data=" + data +
                '}';
    }
    public List<Purchase> addNewProduct(){
        boolean wantToContinue = true;
        while (wantToContinue) {
            System.out.println("Enter new Product name: ");
            Scanner scanner = new Scanner(System.in);
            String product = scanner.nextLine();


            double productPrice;
            while (true) {
                try {
                    System.out.println("Enter price with decimals: ");
                    productPrice = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); 
                }
            }

            products.add(new Purchase(product, productPrice));

            System.out.println("Want to add another Product? Y/N");
            String toContinue = scanner.nextLine();

            if (toContinue.equalsIgnoreCase("n")) {
                wantToContinue = false;
            }
        }

        return products;
    }
    public void addProduct(Purchase purchase){
        products.add(purchase);
    }

}
