//Imports
package BankingSystem;
import java.util.Scanner;

/*Master class is used too siimplify some code in other classes like print method
and scanner objects*/
public class Master 
{
 
   //Scanner object creation
   Scanner input = new Scanner(System.in);

   //Print method
   public static void sop(String str)
   {
        System.out.println(str);
   }
   
   //Validates that the input is a positive int
   public int getInputInt(){
      
      int number;
      
      while (!input.hasNextInt() || (number = input.nextInt()) < 0)
      {
          sop("\nError - must be a positive number, please try again");
          input.nextLine();
      }

      input.nextLine();
      return number;
       
   }
   
   //Validates that the input is a positive double
   public double getInputDouble(){
       
      double number;
      
      while (!input.hasNextDouble()|| (number = input.nextDouble()) < 0)
      {
          sop("\nError - must be a positive amount, please try again");
          input.nextLine();
      }

      input.nextLine();
      return number;
      
   }

}
