//Imports
package BankingSystem;
import java.util.ArrayList;

/*Menu class is meant to show user's possible options while using their
debit card account*/
public class Menu extends BankInfo
{
    //Instance variable
    private boolean cont = true;
    
    public void showMenu()
    {
        //The account array is created
        ArrayList<Account> accountList = new ArrayList<>();
        
        //Main menu for user
        do
        {
            if(accountList.isEmpty())
            {
                sop("\nWarning - you have no accounts on record, select option (5) to add your accounts\n");
            }
            
            else
            {
                //Display all accounts
                displayAcct(accountList);
            }
            
            sop("\n(1) Deposit");
            sop("(2) Withdrawal");
            sop("(3) Minimum or maximum balance");
            sop("(4) List acounts sorted by balance");
            sop("(5) Add account");
            sop("(9) Log out\n");
            sop("Enter option: ");
            char choice = input.next().charAt(0);
            
            //Call methods depending on user choice
            switch (choice) 
            {
                case '1':
                    getDeposit(accountList);
                    break;
                    
                case '2':
                    getWithdraw(accountList);
                    break;                    
                
                case '3':                    
                    System.out.println("\n(1) Account with minimum balance");
                    System.out.println("(2) Account with maximum balance");
                    System.out.println("Enter option:");
                    
                    char userInput = input.next().charAt(0);;
                    
                    //Check if user wants max or min
                    if(userInput == '1')
                    {
                        getMin(accountList);
                    }
                    
                    else if(userInput == '2')
                    {
                        getMax(accountList);
                    }
                    else
                    {
                        sop("\nError - invalid option\n");
                    }
                    break;
                    
                case '4':
                    if(!accountList.isEmpty())
                    {                    
                        sortBal(accountList);
                    }
                    break;
                    
                case '5':
                    addAccount(accountList);
                    break;
                    
                case '9':
                    cont = false;
                    break;
            }                
        
        }while(cont == true);       
    
    }

}