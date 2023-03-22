package entities;

import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Double getBaseSalary() {
        return  baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double sum = baseSalary;

        for (HourContract contract : contracts) {
            LocalDate contractDate = contract.getDate();
            if (contractDate.getYear() == year && contractDate.getMonthValue() == month) {
                sum += contract.totalValue();
            }
        }

        return sum;
    }
}
