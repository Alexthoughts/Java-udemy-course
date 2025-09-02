package Autoboxing_and_Unboxing.Challenge;

import java.util.ArrayList;

public class Branch {
    private String adress;
    private ArrayList<Customer> customers;

    public Branch(String adress) {
        this.customers = new ArrayList<Customer>();
        this.adress = adress;
    }

   public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getAdress() {
        return adress;
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addNewTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i=0; i<this.customers.size();i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
