//Imports
package BankingSystem;

//App class is the starting point for the program
public class App extends Master
{
    //Main Method 
    public static void main(String[] args) throws Exception
    {
        //Starts program
        Login login = new Login();
        
        try
        {
           login.acceptInput();
           login.verify();
        } catch(Exception loginfailed)
        {
           sop(loginfailed.getMessage());
        }
        
    }
    
}
