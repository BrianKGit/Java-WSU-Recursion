/* Author: Brian Klein
 * Date: 10-2-17
 * Program: TowerOfHanoi.java
 * Purpose: 
 *          
 *          
 */
 
import java.util.Scanner;  //use a Scanner object to represent the keyboard
 
public class TowerOfHanoi
{   		

   //create the Scanner object representing the keyboard
   static Scanner console = new Scanner(System.in);
      
   public static void main(String[] args) 
   {
      
      //declare variables
      int n;
      
      System.out.print("How many disks? ");
      n = console.nextInt();
      
      //call move mthod to print the steps
      move(n, 1, 3, 2);// 1 - source, 2 - intermediate, 3 - destination
      
   }//end main
   
   //recursive method
   public static void move(int n, int tower1, int tower3, int tower2){
   
      //base case
      if(n ==1){
         System.out.printf("Move a disk from %d to %d %n", tower1, tower3);
      }
      else{ //divide
         move( n-1, tower1, tower2, tower3); //step 1
         System.out.printf("Move a disk from %d to %d %n", tower1, tower3); //step 2
         move( n-1, tower2, tower3, tower1); //step 3
      }

   }//end method
   
}//end class     