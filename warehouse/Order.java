package practice6.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderManager{
    private QuantityManager quantityManager;
    private List<Product> products = new ArrayList<>();
    private List<Integer> amounts = new ArrayList<>();


    public Order(QuantityManager quantityManager) {
        this.quantityManager = quantityManager;
    }

    public void printOrder() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Заказ обработан. Продукт: " + products.get(i).getName() +
                                ", количество: " + amounts.get(i));
        }
    }
    @Override
    public void processOrder(Product product, int amount) {
        products.add(product);
        amounts.add(amount);
        quantityManager.decreaseProductQuantity(product, amount);
    }
}
