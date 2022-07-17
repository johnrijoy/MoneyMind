package com.slimshady.models;

import java.util.Date;

public class GeneralExpense implements IExpense{

    private int id;
    private Float amount;
    private String description;
    private Date date;

    // normal constructor
    public GeneralExpense(Float amount, String description, Date date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    // getters and setters
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
