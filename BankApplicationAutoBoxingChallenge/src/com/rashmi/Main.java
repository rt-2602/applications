package com.rashmi;

/* creates a bank application, creates a branch of the bank, adds customers, makes transactions */

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addBranch("Vadagaon");
        bank.addCustomerToBranch("Vadagaon", "Avinash", 2);
        bank.addTransactionForCustomerInBranch("Vadagaon", "Avinash", 5);
        bank.getListOfCustomers("Vadagaon");
        bank.addCustomerToBranch("Vadagaon","Jedu",10);
        bank.addTransactionForCustomerInBranch("Vadagaon","Jedu",5);
        bank.getListOfCustomers("Vadagaon");
    }
}
