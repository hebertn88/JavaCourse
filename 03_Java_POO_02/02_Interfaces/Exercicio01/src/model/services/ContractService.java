package model.services;

import model.entities.Contract;
import model.entities.Installment;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double baseAmount = contract.getTotalValue() / months;
        List<Installment> installments = new ArrayList<>();

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            Double amount = calculateInstallmentAmount(baseAmount, i);
            installments.add(new Installment(dueDate, amount));
        }

        contract.addInstallments(installments);

    }

    private Double calculateInstallmentAmount(Double amount, Integer months) {
        amount += onlinePaymentService.interest(amount, months);
        amount += onlinePaymentService.paymentFee(amount);
        return amount;
    }
}
