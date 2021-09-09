public class CheckingAccount extends BankAccount {
    private static double FEE = .15;
    private String name;
    private int initialAmount;
    String accountNumber;

    public CheckingAccount(String nam, int iniAmount) {
        super(nam, iniAmount);
        this.accountNumber = super.getAccountNumber() + "-10";
    }

    @Override
    public boolean withdraw(double amount) {

        double checkClearing = amount + FEE;
        boolean flag;
        flag = super.withdraw(checkClearing);
        return flag;

    }

}