class Account {
    private long accountNumber;
    private String holderName;
    private double balance;

    public Account(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public long getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void display() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }

    @Override
    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount(1001, "Kiran", 50000, 4.5),
            new CurrentAccount(2001, "Rohan", 120000, 25000)
        };
        for (Account a : accounts) {
            a.display();
            System.out.println("----------");
        }
    }
}
