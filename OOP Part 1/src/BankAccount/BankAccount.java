package BankAccount;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //в зависимости от того, какие данные введём, тот конструктор и будет вызван

    protected BankAccount(){
        this(1234, 0,
                "Name", "email", 111111); //call major const.
        System.out.println("Empty constructor called");
    }

    protected BankAccount(String customerName, String email, int phoneNumber) {//call major
        this(9999, 0,customerName,email,phoneNumber);
    }

    protected BankAccount(int accountNumber, int balance,
                          String customerName, String email, int phoneNumber){//major constructor
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    protected void setAccountNumber(int accountNumber1){
       accountNumber = accountNumber1;
    }
    protected void setBalance(int balance1){
        balance = balance1;
    }
    protected void setCustomerName(String customerName1){
        customerName = customerName1;
    }
    protected void setEmail(String email1){
        email = email1;
    }
    protected void setPhoneNumber(int phoneNumber1){
        phoneNumber = phoneNumber1;
    }
    protected int getAccountNumber(){
        return accountNumber;
    }
    protected int getBalance(){
        return balance;
    }
    protected String getCustomerName(){
        return customerName;
    }
    protected String getEmail(){
        return email;
    }
    protected int getPhoneNumber(){
        return phoneNumber;
    }

    protected int depositFunds(int depositAmount){
        balance = balance + depositAmount;
        System.out.println("Deposit amount = " + depositAmount + ", actual balance = " + balance);
        return balance;
    }
    protected int withdrawFunds(int withdrawAmount){
        if (balance - withdrawAmount < 0) {
            System.out.println("You can't withdraw " + withdrawAmount + ", available balance " + balance);
        }else {
            balance = balance - withdrawAmount;
            System.out.println("Withdraw amount = " + withdrawAmount + ", actual balance = " + balance);
        }
        return balance;
    }



}
