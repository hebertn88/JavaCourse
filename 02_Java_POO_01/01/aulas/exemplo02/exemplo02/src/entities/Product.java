package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return String.format("%s, $ %.2f, %d unidades, Total: $ %.2f", this.name, this.price, this.quantity, this.totalValueInStock());
    }


}
