package practice6.warehouse;

public interface QuantityManager {
    void increaseProductQuantity(Product product, int amount);
    void decreaseProductQuantity(Product product, int amount);
}
