/* Author: Brian Klein
 * Date: 10-2-17
 * Program: Fibonacci.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class Fibonacci
{   		
   public static void main(String[] args) 
   {
         //create the Scanner object representing the keyboard
      Scanner console = new Scanner(System.in);
      
         //declare variables
      int position, result;
      
      System.out.print("Enter a position: ");
      position = console.nextInt();
      
      result = fib(position);
            
      System.out.printf("Fibonacci number at position %,d is %,d.",position, result);
                
   }//end main
   
   public static int fib(int n){
      
      //base cases
      if(n == 0 || n == 1){
         return n;
      }
      
      return fib(n-1) + fib(n-2);

   }
   
}//end class