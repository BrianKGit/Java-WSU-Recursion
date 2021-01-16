/* Author: Brian Klein
 * Date: 10-2-17
 * Program: IntegerPower.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class IntegerPower
{   		

   //create the Scanner object representing the keyboard
   static Scanner console = new Scanner(System.in);
      
   public static void main(String[] args) 
   {
      
      //declare variables
      int base, power, result;
      
      System.out.print("Enter the base number: ");
      base = console.nextInt();
      
      System.out.print("Enter the exponent: ");
      power = console.nextInt();
      
      result = intPower(base, power);
      
      System.out.println("The answer is " + result);
      
   }//end main
   
   //recursive method
   public static int intPower(int base, int power){
   
      //base case
      if(power == 0)
         return 1;
      
      if(power == 1)
         return base;
      
      return base * intPower(base, power - 1);
      
   }//end method
   
}//end class     