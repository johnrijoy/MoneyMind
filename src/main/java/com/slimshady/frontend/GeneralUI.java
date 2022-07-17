package com.slimshady.frontend;

import com.slimshady.services.ExpenseDatabaseService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GeneralUI {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----- Money Mind --------");

        boolean loop = true;
        while(loop) {
            try {
                loop = loadMenu(scan);
            } catch ( ParseException p){
                System.out.println(p.getMessage());
                System.out.println("Enter valid Date/Time format (DD-MM-YYYY HH:MM)");
            }
        }
        scan.close();
    }

    private static boolean loadMenu(Scanner scan) throws ParseException {
        String choice;
        System.out.println("Enter your choice");
        System.out.println("a - Enter expense");
        System.out.println("b - view Expenditure");
        System.out.println("c - edit expense");
        System.out.println("d - delete expense");
        System.out.println("q - quit");
        choice = scan.next();
        switch (choice) {
            case "a":
                addExpenseMenu();
                break;
            case "b":
                viewExpenditureMenu();
                break;
            case "c":
                editExpenseMenu();
                break;
            case "d":
                deleteExpenseMenu();
                break;
            case "q":
                return false;
        }
        return true;
    }

    private static void addExpenseMenu() throws ParseException{
        float amount;
        String description;
        String dateString;
        Date date;

        System.out.println("------ Add new Expense -------");
        System.out.println("Enter the amount spend: ");
        amount = scan.nextFloat();
        System.out.println("Enter the description: ");
        scan.next();
        description = scan.nextLine();
        System.out.println("Enter the date and time (DD-MM-YYYY HH:MM): ");
        dateString = scan.nextLine(); //implement proper regex for dd\mm\yyyy hh:mm

        date = new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(dateString);

        ExpenseDatabaseService.addExpense(amount, description, date);
        System.out.println("Expense Added");


    }

    private static void viewExpenditureMenu() {

    }

    private static void editExpenseMenu() {
    }

    private static void deleteExpenseMenu() {

    }


}
