public interface BankAccount {
    public String showAccountType();
    public Double getInterestRate();
    public Double getBalance();
    public String showBenefits();
    public Double computeBalanceWithInterest();
    public String showInfo();
    
    //Additional Getters
    public String getAccountNumber(); 
    public String getAccountName();
}
