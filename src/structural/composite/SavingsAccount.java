package structural.composite;

public class SavingsAccount implements Account
{
    private String accountNumber;
    private float accountBalance;
    
    SavingsAccount(String acNo, Float acBalance){
        accountNumber = acNo;
        accountBalance = acBalance;
    }
    @Override
    public float getBalance()
    {
        return this.accountBalance;
    }
    
    @Override
    public String toString()
    {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
