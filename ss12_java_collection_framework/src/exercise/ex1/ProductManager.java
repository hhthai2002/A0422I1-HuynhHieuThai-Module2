package exercise.ex1;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public ProductManager(){
    }

    public ProductManager(ArrayList<Product> products){
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void show(){
        for(int i = 0; i < products.size(); i++){
            System.out.println("Product " + (i + 1) + products.get(i));
        }
    }
}
