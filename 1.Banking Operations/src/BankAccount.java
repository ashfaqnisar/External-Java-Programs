public class BankAccount {

    private int account;
    private double balance;
    private String accountName;

    public BankAccount() {
    }

    public BankAccount(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public BankAccount(int account, double balance, String accountName) {
        this.account = account;
        this.balance = balance;
        this.accountName = accountName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void creditMoney(double amount){
        if (balance<amount){
            System.err.println("You don't have sufficient money in your account.");
        }else {
            balance -=amount;//This is same as balance = balance-amount;
            System.out.println("Your remaining balance after credit is "+ balance);
        }
    }

    public void debitMoney(double amount){
        balance += amount; //This is same as balance = balance + amount;
        System.out.println("Your remaining balance after debit is "+ balance);
    }

}
