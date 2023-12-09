public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(SavingsAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
       this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return bankAccount.getBalance()*0.04; //4% interest for balance
    }

    @Override
    public Double getBalance() {
       return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, With Insurance";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() + bankAccount.getBalance()*0.04;
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
