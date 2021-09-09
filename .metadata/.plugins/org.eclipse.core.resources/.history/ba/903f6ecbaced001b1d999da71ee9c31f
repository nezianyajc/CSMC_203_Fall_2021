public class SavingsAccount extends BankAccount {
    private double rate = 2.5;
    private double savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interes = rate * .100;
        double newIntBal = interes * super.getBalance();

        System.out.println(newIntBal);
    }

    @Override
    public String getAccountNumber() {
        return null;
    }

    public SavingsAccount(SavingsAccount acct, double balance) {
        super(acct, balance);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

}