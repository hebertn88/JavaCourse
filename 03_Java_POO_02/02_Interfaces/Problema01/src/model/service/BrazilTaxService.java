package model.service;

public class BrazilTaxService {
    public static double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        }
        return amount * 0.15;
    }
}
