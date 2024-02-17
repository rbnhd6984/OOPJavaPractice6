package practice6.warehouse;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void decreaseQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            throw new IllegalArgumentException("Недостаточное количество товара на складе");
        }
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    @Override
    public String toString() {
        return '{' +
                "наименование=" + name +
                ", количество=" + quantity +
                ", цена=" + price +
                '}';
    }
}
