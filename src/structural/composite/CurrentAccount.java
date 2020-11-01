package structural.composite;

public class CurrentAccount implements Account
{
    private String accountNumber;
    private float accountBalance;
    
    CurrentAccount(String acNo, Float acBalance){
        accountNumber = acNo;
        accountBalance = acBalance;
    }
    
    @Override
    public float getBalance()
    {
        return accountBalance;
    }
    
    @Override
    public String toString()
    {
        return "CurrentAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
