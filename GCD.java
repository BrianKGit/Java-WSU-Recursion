/* Author: Brian Klein
 * Date: 10-2-17
 * Program: GCD.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class GCD
{   		

   //create the Scanner object representing the keyboard
   static Scanner console = new Scanner(System.in);
      
   public static void main(String[] args) 
   {
      
      //declare variables
      int m, n;
      
      System.out.print("Enter two integers: ");
      m = console.nextInt();
      n = console.nextInt();
      
      System.out.println("The greatest common divisor is " + getGCD(m, n));
      
   }//end main
   
   //recursive method
   public static int getGCD(int m, int n){
   
      //base case
      int r = m % n;
      if(r == 0){
         return n;
      }
      else{ 
         return getGCD(n, r);
         }
   }//end method
   
}//end class     