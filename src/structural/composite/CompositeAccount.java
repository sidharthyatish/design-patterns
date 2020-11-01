package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements Account
{
    private List<Account> accounts = new ArrayList<>();
    
    @Override
    public float getBalance()
    {
        float balance = 0;
        for(Account account : accounts){
            balance+=account.getBalance();
        }
        return balance;
    }
    
    public void addAccount(Account account){
        this.accounts.add(account);
    }
    public void removeAccount(Account account){
        this.accounts.remove(account);
    }
    
    @Override
    public String toString()
    {
        return "CompositeAccount{" +
                "accounts=" + accounts +
                '}';
    }
}
