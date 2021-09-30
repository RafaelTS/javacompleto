package br.sc.rafael.secao18.model.entities;

import java.util.Date;

public class Installment {

    private Date dueDate;
    private Double amount;

    public Installment() {
    }

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDuoDate() {
        return dueDate;
    }

    public void setDuoDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
