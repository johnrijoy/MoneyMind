package com.slimshady.services;

import com.slimshady.models.GeneralExpense;

import java.time.LocalDate;
import java.util.Date;

// handles creating expense objects and related services
public class ExpenseHandler {
    GeneralExpense expense;

    // create an expense
    public GeneralExpense newExpense(Float amount, Date date, String description) {
        this.expense = new GeneralExpense(amount, description, date);
        return this.expense;
    }

    public GeneralExpense newExpense(Float amount, Date date) {
        this.expense = new GeneralExpense(amount, "", date);
        return this.expense;
    }

    public GeneralExpense newExpense(Float amount) {
        Date currentDate = new Date();
        this.expense = new GeneralExpense(amount, "", currentDate);
        return this.expense;
    }
}
