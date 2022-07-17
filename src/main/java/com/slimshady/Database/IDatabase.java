package com.slimshady.Database;

import com.slimshady.models.GeneralExpense;

import java.util.List;

public interface IDatabase {
    void appendExpense(GeneralExpense expense);
    List<GeneralExpense> getExpenditure();
    void updateExpense(int id, GeneralExpense expense);

    void removeExpense(GeneralExpense expense);
}
