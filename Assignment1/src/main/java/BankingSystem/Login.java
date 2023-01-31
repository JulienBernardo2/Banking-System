//Imports
package BankingSystem;

/*Login class is meant to get the user into their debit card account and verify
that the number and passwords match*/
public class Login extends Master
{
    //Instance Variables
    private final int debitNum = 1234;
    private final int debitPass = 9999;
    private int debitN;
    private int debitP;
    //Methods
    
    //Method to get input for user debit card number and password
    public void acceptInput()
    {
        
        sop("\nBanking Login");
        sop("*************");

        //Get user debit number and pin
        sop("\nEnter Card Number: ");
        debitN = getInputInt();
        
        sop("\nEnter PIN: ");
        debitP = getInputInt();
        sop("\n");
    }
    
    //Method to verify that the debit card number and pass match user inputs
    public void verify() throws Exception
    {
        //Check the number and password
        if(debitN == debitNum && debitP == debitPass)
        {
            sop("Login successfull\n");
            
            //Creates the menu
            Menu menu = new Menu();
            menu.showMenu();
        }
       
        else
        {
            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect Card Number and PIN\n");
            throw loginfailed;
        }
    
    }

}
