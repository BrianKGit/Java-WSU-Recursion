/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: Recursion.java
 * Description: First method calculates and returns the product of two positive 
 *              integers using only addition. The second method calculates and 
 *              returns the sum of all the integers from 1 up to the number 
 *              passed as an argument. Call methods with user input from Main 
 *              Method.
 */

import java.util.*;

public class Recursion {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y, product, n;

        System.out.print("Enter first integer: ");
        x = console.nextInt();

        System.out.print("Enter second integer: ");
        y = console.nextInt();

        product = calProduct(x, y);

        System.out.println("Product of " + x + " and " + y + " is: " + product);
        
        System.out.print("Enter another integer: ");
        n = console.nextInt();
        
        System.out.println("The Sum of " + n + " and all the integers starting "
                + "from 1 up to " + n + " is: " + calSum(n));

    }

    public static int calProduct(int x, int y) {

        //base case
        if (y == 1) {
            return x;
        }
         return x + calProduct(x, y-1);

    }

    public static int calSum(int n) {
        
        //base cases
        if( n ==1 || n == 0){
            return n;
        }

        return n + calSum(n-1);
    }

}
