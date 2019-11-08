package com.rashmi;

import java.util.ArrayList;

public class Bank {

    ArrayList<Branches> branches = new ArrayList<Branches>();

    public void addBranch(String branchName){
        Branches branch = new Branches();
        branch.setBranchName(branchName);
        branches.add(branch);
    }

    public void addCustomerToBranch(String branchName, String customerName, double initialTransactionAmount){
        boolean isTransactionSuccessful=false;
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                branches.get(i).addCustomer(customerName, initialTransactionAmount);
                isTransactionSuccessful=true;
            }
        }
        if(isTransactionSuccessful==true){
            System.out.println("Transaction "+initialTransactionAmount+" sucessfully added for "+customerName+" in branch "+branchName);
        }else{
            System.out.println("Transaction "+initialTransactionAmount+" unsucessfully for "+customerName+" in branch "+branchName);
        }
    }

    public void addTransactionForCustomerInBranch(String branchName, String customerName, double transactionAmount){
        boolean isTransactionSuccessful=false;
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                for(int j=0; j<branches.get(i).getArCustomers().size(); j++){
                    if(branches.get(i).getArCustomers().get(j).getName().equals(customerName)){
                        branches.get(i).addTransaction(customerName, transactionAmount);
                        isTransactionSuccessful=true;
                    }
                }
            }
        }

        if(isTransactionSuccessful==true){
            System.out.println("Transaction "+transactionAmount+" sucessfully added for "+customerName+" in branch "+branchName);
        }else{
            System.out.println("Transaction "+transactionAmount+" unsucessfully for "+customerName+" in branch "+branchName);
        }

    }

    public void getListOfCustomers(String branchName){
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                for(int j=0; j<branches.get(i).getArCustomers().size(); j++){
                    System.out.println("Branch name : "+branchName+", Customer name : "+branches.get(i).getArCustomers().get(j).getName()+
                            ", Transaction : "+branches.get(i).getArCustomers().get(j).getArTransactions().toString());
                }
            }
        }
    }

    public ArrayList<Branches> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branches> branches) {
        this.branches = branches;
    }
}
