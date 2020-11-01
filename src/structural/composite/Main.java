package structural.composite;

public class Main
{
    public static void main(String[] args)
    {
        /*
            Composite is applicable for hierarchy.
            Account
             /   \
         Current Savings
         
         Since composite implements account
         1. we can keep list of current accounts and do operations
         2. we can keep list of savings accounts and do operations
         we can keep a combined list of 1 and 2 and do operations
         
         The fun part is we can keep a composite object to maintain a list of composite objects itself
         This fun part means that we can't restrict the types of objects that goes in and have to do run time checks
         e.g. in 1. combinedAccount contains list of  composite account classes
                 2. savingsAccount contains list of SavingsAccount classes
                 3. currentAccounts contains list of currentAccount classes
                 
                 But 1,2,3 are CompositeAccount class only
         */
        CurrentAccount ca1 = new CurrentAccount("C01",100f);
        CurrentAccount ca2 = new CurrentAccount("C02",200f);
        
        CompositeAccount currentAccounts = new CompositeAccount();
        currentAccounts.addAccount(ca1);
        currentAccounts.addAccount(ca2);
        System.out.println(currentAccounts);
        System.out.println(currentAccounts.getBalance());
        
        
        SavingsAccount sa1 = new SavingsAccount("S01",300f);
        SavingsAccount sa2 = new SavingsAccount("S02",400f);
        
        CompositeAccount savingsAccounts = new CompositeAccount();
        savingsAccounts.addAccount(sa1);
        savingsAccounts.addAccount(sa2);
        System.out.println(savingsAccounts);
        System.out.println(savingsAccounts.getBalance());
        
        CompositeAccount combinedAccounts = new CompositeAccount();
        combinedAccounts.addAccount(currentAccounts);
        combinedAccounts.addAccount(savingsAccounts);
        System.out.println(combinedAccounts);
        System.out.println(combinedAccounts.getBalance());
        
        
    }
}
