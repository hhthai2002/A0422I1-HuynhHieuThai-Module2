package exercise.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice = 0;
        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Add product");
            System.out.println("2. Edit product by id");
            System.out.println("3. Delete product");
            System.out.println("4. Show list products");
            System.out.println("5. Find any product by name");
            System.out.println("6. Sort product by increasing/decreasing price");
            System.out.println("Your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter product ID: ");
                    String idPro = scanner.next();
                    System.out.println("Enter product name: ");
                    String namePro = scanner.next();
                    System.out.println("Enter product price: ");
                    double pricePro = scanner.nextDouble();
                    Product product = new Product(idPro, namePro, pricePro);
                    productManager.addProduct(product);
                    break;
                case 2:
                case 3:
                case 4:
                    productManager.show();
                case 5:
                case 6:
            }
        }
        while (true);
    }
}
