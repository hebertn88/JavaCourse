package entities;

public class Employee {
    public String name;
    public double grossSalary, tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }

    public String toString() {
        return String.format("%s, $ %.2f", this.name, this.netSalary());
    }
}
