package practice6.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements ProductManager, QuantityManager{
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void increaseProductQuantity(Product product, int amount) {
        product.increaseQuantity(amount);
    }

    @Override
    public void decreaseProductQuantity(Product product, int amount) {
        product.decreaseQuantity(amount);
    }

    @Override
    public String toString() {
        return "Склад {" +
                "Товары=" + products +
                '}';
    }

    public void printInventory() {
        System.out.println("\nОстаток товаров на складе:");
        for (Product product : products) {
            System.out.println("Продукт: " + product.getName() + ", количество: " + product.getQuantity());
        }
    }
}
