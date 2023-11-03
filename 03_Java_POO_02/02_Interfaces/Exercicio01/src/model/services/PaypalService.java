package model.services;

public class PaypalService implements OnlinePaymentService {
    private static final Double INTEREST = .01;
    private static final Double FEE = .02;
    @Override
    public Double paymentFee(Double amount) {
        return amount * FEE;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * INTEREST * months;
    }
}
