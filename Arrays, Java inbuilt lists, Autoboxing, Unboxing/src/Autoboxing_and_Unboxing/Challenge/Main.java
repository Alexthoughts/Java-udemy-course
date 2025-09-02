package Autoboxing_and_Unboxing.Challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Big bank");
        bank.addBranch("1");

        bank.addCustomer("1","Bob",100);
        bank.addCustomer("1", "Jim", 200);


        bank.addBranch("2");
        bank.addCustomer("2", "John", 350);
        bank.addCustomer("2", "May", 450);


        bank.addTransaction("1", "Bob", 1000);
        bank.addTransaction("1", "Bob", 10000);

        bank.listOfCustomers("1", true);
        bank.listOfCustomers("2", true);

    }
}
