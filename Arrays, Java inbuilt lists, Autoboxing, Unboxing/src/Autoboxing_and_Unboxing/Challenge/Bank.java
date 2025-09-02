package Autoboxing_and_Unboxing.Challenge;

import java.util.ArrayList;

public class Bank {
    private String adress;
    private ArrayList<Branch> branches;

    public Bank(String adress) {
        this.adress = adress;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String adress) {
        if (findBranch(adress) == null) {
            this.branches.add(new Branch(adress));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String adress, String name, double initialAmount) {
        Branch branch = findBranch(adress);
        if (branch != null) {
            return branch.addNewCustomer(name, initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String adress, String name, double initialAmount) {
        Branch branch = findBranch(adress);
        if (branch != null) {
            return branch.addNewTransaction(name,initialAmount);
        }
        return false;
    }


    private Branch findBranch(String branchAdress) {
        for (int i=0; i<this.branches.size();i++) {
            Branch branch = this.branches.get(i);
            if (branch.getAdress().equals(branchAdress)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listOfCustomers(String branchAdress, boolean showTransactions) {
        Branch branch = findBranch(branchAdress);
        if (branch != null){
            System.out.println("Branch " + branch.getAdress());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
        for (int i=0; i<branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1 + "]"));
        if (showTransactions) {
            System.out.println("Transactions");
            ArrayList<Double> transactions = branchCustomer.getTransactions();
            for (int j=0; j<transactions.size();j++) {
                System.out.println(j+1 + ". " + transactions.get(j));
            }
                 }
        }
        return true;
        } else {
        return false;
        }
    }
}
