package com.slimshady.Database;

import com.slimshady.models.GeneralExpense;

import java.util.ArrayList;
import java.util.List;

public class InternalStorage implements IDatabase{
    List<GeneralExpense> expenseDatabase = new ArrayList<>();

    @Override
    public void appendExpense(GeneralExpense expense) {
        this.expenseDatabase.add(expense);
    }

    @Override
    public List<GeneralExpense> getExpenditure() {
        return expenseDatabase;
    }

    @Override
    public void updateExpense(int index, GeneralExpense expense) {
        expenseDatabase.add(index, expense);
    }

    @Override
    public void removeExpense(GeneralExpense expense) {
        expenseDatabase.remove(expense);
    }
}
