package BankAccount;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    protected VipCustomer(String name, int creditLimit, String email) {
        System.out.println("Constructor with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    protected VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"default@gmail.com");
    }

    protected VipCustomer(){
        this("name", 4444, "default@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
