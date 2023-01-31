//Imports
package BankingSystem;
import java.util.ArrayList;

/*Account class is meant to hold values, methods, and constructors for 
account type objects*/
public class Account extends Master
{
    //Instance Variables
    private String accountNum;
    private double accountBal;
    
    //Constructors
    public Account()
    {
        this.accountNum = null;
        this.accountBal = 0;
    }
    
    public Account(String accNum, double accBal)
    {
        this.accountNum = accNum;
        this.accountBal = accBal;           
    }
    
    //Methods
    
    //Setters
    public void setAccBal(double accBal)
    {
        this.accountBal = accBal;
    }
    
    public void setAccNum(String accNum)
    {
        this.accountNum = accNum;
    }
    
    //Getters
    public String getAccNum()
    {
        return this.accountNum;
    }
    
    public double getAccBal()
    {
        return this.accountBal;
    }
    
    //Display Method
    public void displayAcct(ArrayList<Account> accountList)
    {
        sop("____________________________________");
        
        System.out.printf("\n%-20s %15s", "Account", "Balance");
        System.out.printf("\n%-20s %15s", "---------------", "---------------");
        
        for(int count = 0; count < accountList.size(); count++)
        {
            System.out.printf("\n%-20s %15s", accountList.get(count).getAccNum(), String.format("$ %.2f",accountList.get(count).getAccBal()));
        }
        
        sop("");
    
    }
    
    //Method to select an account from user
    public int selectAcct(ArrayList<Account> accountList)
    {
        
        if (accountList.isEmpty())
        {
            sop("\nError - no account found\n");
            return -1;
        }

        //Display all accounts
        displayAcct(accountList);
        
        //Get user selected account
        sop("\nSelect account:");
        String selectedAcct = input.next();
        
        //Loop through banking Array to find selected account 
        for (int i = 0; i < accountList.size(); i++) 
        {            
            if (accountList.get(i).getAccNum().equals(selectedAcct) == true) 
            {    
                return i;
            }
        }
        
        sop("\nError - account does not exist\n");
        return -1;
        
    }
     
    //Method for user to be able to add an account to their debit card
    public void addAccount(ArrayList<Account> accountList)
    {
        boolean accExist = false;
        
        //Get user to add the account number to the new account            
        sop("\nEnter new account: ");
        String accNum = input.next();
        
        for(int count = 0; count < accountList.size(); count++)
        {
            if(accountList.get(count).getAccNum().equals(accNum))
            {
                accExist = true;
            }
        }
        
        if(accExist == true)
        {
            sop("\nError - account already exists");
        }        
        else
        {
            //Every new accout will have no money till user deposits 
            Account account = new Account(accNum, 0);
            accountList.add(account);
        
            sop("\nAccount added successfully");
        }
        
    }
    
}

