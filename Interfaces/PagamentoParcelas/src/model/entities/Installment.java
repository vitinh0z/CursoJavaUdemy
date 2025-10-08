package model.entities;

import java.util.Date;

public class Installment {

    private LocalDate localDate;
    double amount;

    public Installment(Date localDate, double amount) {
        this.localDate = localDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return localDate;
    }

    public void setDueDate(Date localDate) {
        this.localDate = localDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
