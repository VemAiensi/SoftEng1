public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public GSave(SavingsAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "Gsave";
    }

    @Override
    public Double getInterestRate() {
        return bankAccount.getBalance()*0.025; //2.5% interest for balance
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, GSave Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() + bankAccount.getBalance()*0.025;
    }

    @Override
    public String showInfo() {
        return "Account number: " + getAccountNumber() + 
             "\nAccount name: " + getAccountName() +
             "\nBalance: " + getBalance();
    }

    @Override
    public String getAccountNumber() {
        return bankAccount.getAccountNumber();
    }

    @Override
    public String getAccountName() {
        return bankAccount.getAccountName();
    }
}
