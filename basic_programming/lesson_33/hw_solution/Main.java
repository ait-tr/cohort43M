package consultation_12.code.tasks.TaskProduct;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog= new ProductCatalog();
        Product product1 = new Product("PC",799);
        Product product2 = new Product("Monitor",264);


        catalog.addProduct(1,product1);
        catalog.addProduct(2,product2);

        System.out.println("\nAll product in catalog");
        catalog.listAllProducts();

        catalog.addProduct(1,new Product("Smartphone",299));

        Product foundProduct = catalog.findProduct(1);
        System.out.println("\nFound Product: " + foundProduct);

        System.out.println("\nDelete product by id: 1, 2 and 3");

        catalog.deleteProduct(1);
        catalog.deleteProduct(2);
        catalog.deleteProduct(3);


        catalog.listAllProducts();
   }
}
