package conditions.pract_tasks.task_4;

import java.util.Arrays;
import java.util.List;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Natali", 30, 5);
        Product product2 = new Product("Yegor", 32, 4);
        Product product3 = new Product("Ivan", 27, 8);
        Product product4 = new Product("Zoi", 29, 3);
        List<Product> list = Arrays.asList(product1, product2, product3, product4);
        Product maxPrice = list.stream().max((prod1, prod2)-> Integer.compare(prod1.getPrice(), prod2.getPrice())).get();
        Product maxQuantity = list.stream().max((prod1, prod2)-> Integer.compare(prod1.getQuantity(), prod2.getQuantity())).get();
        System.out.println(maxPrice.getName() + " "+ maxPrice.getQuantity());
        System.out.println(maxQuantity.getName());
    }
}
