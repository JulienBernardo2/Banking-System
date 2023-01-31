//Imports
package BankingSystem;

public class InvalidBankTransaction extends Exception
{
    //Instance variable
    String errorMessage;
    
    //Constructor
    public InvalidBankTransaction(String message)
    {
        errorMessage = message;
    }
    
    //Method
    public String getMessage()
    {
        return errorMessage;
    }
}
