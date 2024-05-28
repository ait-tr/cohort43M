package consultation_12.code.tasks.TaskProduct;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer,Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
    }
    public void addProduct(int productId, Product product){
        if(products.containsKey(productId)){
            System.out.println("\nError: Product with ID " + productId + " already exists in the catalog.");
        }else{
            products.put(productId,product);
            System.out.println("\nProduct added: " + product);
        }
    }
    public void deleteProduct(int productId){
        if(!products.containsKey(productId)){
            System.out.println("\nError: No product found with ID " + productId + ".");
        }else{
            products.remove(productId);
            System.out.println("\nProduct with ID " + productId + " removed from the catalog.");
        }
    }
    public Product findProduct(int productId){
        if(!products.containsKey(productId)){
            System.out.println("\nError: No product found with ID " + productId + ".");
            return null;
        }else{
            return products.get(productId);
        }
    }
    public void listAllProducts(){
        if(products.isEmpty()){
            System.out.println("\nThe catalog is empty.");
        }else{
            for(Map.Entry<Integer,Product> entry : products.entrySet()){
                System.out.println("\nID: " + entry.getKey() + ", Product: " + entry.getValue());
            }
        }
    }
}
