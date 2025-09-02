package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(123456, 1000,
                "Alex", "alex@gmail.com", 774192374);
        myAccount.depositFunds(50);
        myAccount.withdrawFunds(200);
        myAccount.withdrawFunds(851);

        BankAccount yoursAccount = new BankAccount("Tim", "tim@gmail.com,",888);
        System.out.println(yoursAccount.getBalance());

        VipCustomer I = new VipCustomer();
        System.out.println(I.getName() + I.getEmail() + I.getCreditLimit());
    }
}
