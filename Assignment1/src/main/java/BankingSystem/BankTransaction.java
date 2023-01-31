//Imports
package BankingSystem;
import static BankingSystem.Master.sop;
import java.util.ArrayList;

/*Move amount class is meant to hold the methods to edit balances by depositing
money and withdrawing amounts*/
public class BankTransaction extends Account {
    
    //Method to deposit money into account balance
    public void getDeposit(ArrayList<Account> accountList)
    {
        int selectedAcctIdx = selectAcct(accountList);
        
        if(selectedAcctIdx != -1)
        {
            //Get the amount of money the use wants to deposit
            sop("\nEnter deposit amount: ");
            double amountDep = getInputDouble();
        
            addDeposit(amountDep, accountList, selectedAcctIdx);     
        } 
        
    }
    
    //Add Deposit amount from selected account balance
    public void addDeposit(double amountDep, ArrayList<Account> accountList, int selectedAcctIdx)
    {

        //Get the current balance for user selected account
        double holdBalance = accountList.get(selectedAcctIdx).getAccBal();
        
        //Add the deposit amount to the balance
        holdBalance += amountDep;
        accountList.get(selectedAcctIdx).setAccBal(holdBalance); 
        
        sop("\nDeposit successful\n");
    }
    
    //Method to withdraw money from selected account
    public void getWithdraw(ArrayList<Account> accountList)
    {      
      
        int selectedAcctIdx = selectAcct(accountList);

        if (selectedAcctIdx != -1)
        {
            //Get the amount of money the use wants to withdraw
            sop("\nEnter withdrawal amount: ");
            double amountWit = getInputDouble();
      
     
            if(accountList.get(selectedAcctIdx).getAccBal() >= amountWit )
            {
                subWithdraw(amountWit, accountList, selectedAcctIdx);
            }
            
            else
            {
                sop("\nError - withdrawal amount cannot exceed account balance\n");
            }
        }       
    }
    
    //Subtract Withdraw amount from selected account balance 
    public void subWithdraw(double amtW, ArrayList<Account> accountList, int selectedAcctIdx)
    {
        //Get the current balance for user selected account
        double holdBalance = accountList.get(selectedAcctIdx).getAccBal();
        
        //Subtract withdraw amount to the balance
        holdBalance -= amtW;
        accountList.get(selectedAcctIdx).setAccBal(holdBalance); 
        sop("\nWithdrawal successful\n");       
    }
    
}
