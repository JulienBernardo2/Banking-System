//Imports
package BankingSystem;
import static BankingSystem.Master.sop;
import java.util.ArrayList;

/*Return info class is meant to hold the methods where users get information
about their account such as max, min or sorting accounts*/
public class BankInfo extends BankTransaction{
    
    //Method to show the Max from the array list
    public void getMax(ArrayList<Account> accountList)
    {
        double tempBal = 0;
        int tempBalIdx = -1;
        
        for (int i = 0; i < accountList.size(); i++)
        {
            if(i == 0)
            {
                tempBal = accountList.get(i).getAccBal();
                tempBalIdx = i;
            }
            else if(accountList.get(i).getAccBal() > tempBal)
            {
                tempBal = accountList.get(i).getAccBal();
                tempBalIdx = i;
            }
        }
        
        if(tempBalIdx >= 0)
        {
            sop("\nMaximum balance: " + String.format("$ %.2f", tempBal));
            
            for (int i = 0; i < accountList.size(); i++) 
            {            
                if (accountList.get(i).getAccBal() == tempBal) 
                {    
                    sop("Account - " + accountList.get(i).getAccNum() + "  " + String.format("$ %.2f",accountList.get(i).getAccBal()));
                }
            }
            
        }
        
    }
    
    //Method to show the Min from the array list
    public void getMin(ArrayList<Account> accountList)
    {
        double tempBal = 0;
        int tempBalIdx = -1;
        
        for (int i = 0; i < accountList.size(); i++)
        {
            if(i == 0)
            {
                tempBal = accountList.get(i).getAccBal();
                tempBalIdx = i;
            }
            else if(accountList.get(i).getAccBal() < tempBal)
            {
                tempBal = accountList.get(i).getAccBal();
                tempBalIdx = i;
            }   
        }
        
        if(tempBalIdx >= 0)
        {
            sop("\nMinimum balance: " + String.format("$ %.2f", tempBal));
            
            for (int i = 0; i < accountList.size(); i++) 
            {            
                if (accountList.get(i).getAccBal() == tempBal) 
                {    
                    sop("Account - " + accountList.get(i).getAccNum() + "  " + String.format("$ %.2f",accountList.get(i).getAccBal()));
                }
            }
            
        }
        
    }
    
    //Method to sort accounts by min to max balances
    public void sortBal(ArrayList<Account> accountList)
    {
        //First loop through the array
        for(int i = 0; i < accountList.size(); i++)
        {
            //Second loop through the array
            for(int j = i + 1; j < accountList.size(); j++)
            {
                if(accountList.get(j).getAccBal() < accountList.get(i).getAccBal())
                {
                    Account temp = new Account();
                    temp = accountList.get(j);
                    accountList.set(j, accountList.get(i));
                    accountList.set(i, temp);
                } 
            }
        }
        
        sop("\n\nAccounts are now sorted by Balance");
        
    }
}
