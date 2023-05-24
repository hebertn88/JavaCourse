package application.entities;

public class Product {
    private final String name;
    private final Double value;
    private final int quantity;

    public Product(String name, Double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getTotalValue() {
        return value * quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + String.format("%.2f", value) +
                ", quantity=" + quantity +
                '}';
    }
}
