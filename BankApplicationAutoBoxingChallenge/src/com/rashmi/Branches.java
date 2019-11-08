package com.rashmi;

import java.util.ArrayList;

public class Branches {
    ArrayList<Customers> arCustomers = new ArrayList<Customers>();
    String branchName;

    public ArrayList<Customers> getArCustomers() {
        return arCustomers;
    }

    public void setArCustomers(ArrayList<Customers> arCustomers) {
        this.arCustomers = arCustomers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void addCustomer(String customerName, double initialTransactionAmout){
        Customers customer = new Customers();
        customer.setName(customerName);
        customer.getArTransactions().add(initialTransactionAmout);
        arCustomers.add(customer);
    }

    public void addTransaction(String name, double transactionAmout){

        for(int i=0; i<arCustomers.size(); i++){
            if(arCustomers.get(i).getName().equals(name)){
                arCustomers.get(i).getArTransactions().add(transactionAmout);

            }
        }

    }
}
