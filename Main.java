package practice6;

import practice6.warehouse.Order;
import practice6.warehouse.Product;
import practice6.warehouse.Warehouse;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Product pasta = new Product("Макароны", 1000, 65);
        Product rice = new Product("Рис", 700, 100);
        Product flour = new Product("Мука", 900, 90);
        Product apple = new Product("Яблоки", 1000, 150);
        Product banana = new Product("Бананы", 800, 170);

        warehouse.addProduct(pasta);
        warehouse.addProduct(rice);
        warehouse.addProduct(flour);
        warehouse.addProduct(apple);
        warehouse.addProduct(banana);

        System.out.println(warehouse);

        Order order = new Order(warehouse);
        order.processOrder(rice, 10);
        order.processOrder(banana, 3);
        order.processOrder(pasta, 1);

        order.printOrder();
        warehouse.printInventory();

    }
}
