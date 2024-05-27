public class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;


    public Account(String accountNumber, double initialBalance, String ownerName, String ownerEmail, String ownerPhone) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    // Get
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    //Set
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " was made. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from the account. Remaining balance = " + balance);
        } else {
            System.out.println("Insufficient funds. You have " + balance + " in your account.");
        }
    }


    public static void main(String[] args) {
        // Creating an account
        Account account = new Account("123456789", 1000.0, "John Doe", "john@example.com", "1234567890");


        account.withdraw(900.0);
        account.deposit(250.0);
        account.withdraw(50.0);
    }
}