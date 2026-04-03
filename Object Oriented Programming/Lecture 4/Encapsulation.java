class BankAccount {
    private String accountNumber;
    private double accountBal;

    BankAccount(String accountNumber, double accountBal) {
        this.accountNumber = accountNumber;
        this.accountBal = accountBal;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBal;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            accountBal += amount;
            System.out.println("Amount Deposited Sucessfully");
        }
        else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= accountBal) {
            accountBal -= amount;
            System.out.println("Amount Debited Successfully");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        BankAccount obj = new BankAccount("569023UCBA",20000);
        System.out.println("Account Number : " + obj.getAccountNumber());
        System.out.println("Account Balance : " + obj.getAccountBalance());

        obj.deposit(5000);
        obj.withdraw(10000);

        System.out.println("Account Number : " + obj.getAccountNumber());
        System.out.println("Account Balance : " + obj.getAccountBalance());
    }
}
