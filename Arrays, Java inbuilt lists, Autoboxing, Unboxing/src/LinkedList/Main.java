package LinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim",54.6); //first class
        Customer anotherCustomer = customer; //second class
        anotherCustomer.setBalance(12.8); //rewrite Tim balance
        //when we call .setBalance in second class, we we rewrite the balance from the first class
        System.out.println("Balance: " + customer.getBalance() + ", name: " + customer.getName());

        ArrayList<Integer> intList  = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1,2);//между значением "1" и "3" будет записана 2
        //Будет выглядеть так: 1,2,3,4 -> позиции тройки и четверку будут подвинуты на одну вверх

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + " : " + intList.get(i));
        }
    }
}
