public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private Double balance;

    @Override
    public String showAccountType() {
        return "Savings Acocunt";
    }
    @Override
    public Double getInterestRate() {
        return balance*0.01; //1% interest for balance
    }
    @Override
    public Double getBalance() {
        return balance;
    }
    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }
    @Override
    public Double computeBalanceWithInterest() {
        return balance + balance*0.01;
    }
    @Override
    public String showInfo() {
        return "Account number: " + accountNumber + 
             "\nAccount name: " + accountName +
             "\nBalance: " + balance;
    }

    //Implementing additional getters
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
    @Override
    public String getAccountName() {
        return accountName;
    }

    //Adding setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = Integer.toString(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
