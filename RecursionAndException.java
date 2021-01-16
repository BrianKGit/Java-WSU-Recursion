/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: RecursionAndException.java
 * Description: Let committee (n, k) to represent the number of different 
 *              committees of k people that can be formed, given n people from 
 *              whom to choose: committee (n, k) = committee(n-1, k) + 
 *              committee(n-1, k-1) Write a program that includes a recursive 
 *              method to compute committee(n, k) for n and k >=1. (This 
 *              problem is also known as binomial coefficient) If the user 
 *              enters an invalid input, use Java exception handling techniques
 *              to handle the appropriate exception until the user enters a 
 *              valid input.
 */

import java.util.*;

public class RecursionAndException {

    static Scanner console = new Scanner(System.in);
    static final double SENTINEL = -1;

    public static void main(String[] args) {

        int n, k, total;
        

        n = enterN();
        
        k = enterK();
        
        total = calTotal(n, k);

        System.out.println("The answer is " + total + " different committees.");

    }

    public static int enterN() {

        int n = 0;
        boolean flag = false;

        do {
            try {
                System.out.print("Enter number of people to choose from(-1 to exit): ");
                n = console.nextInt();

                if (n == SENTINEL) {
                    System.out.println("Thank you for using this program!");
                    System.exit(1);
                } else if (n < 1) {
                    throw new InvalidIntegerException();
                }

                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid, enter an integer.");
            } catch (InvalidIntegerException e) {
                System.out.println(e.toString());
            }  catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (!flag);

        return n;
    }//end enterN()

    public static int enterK() {
        
        int k = 0, n = enterN();
        boolean flag = false;
        
        do {
            try {

                System.out.print("Enter number of people in the committee: ");
                k = console.nextInt();

                if (k == SENTINEL) {
                    System.out.println("Thank you for using this program!");
                    System.exit(1);
                } else if (k < 1) {
                    throw new InvalidIntegerException();
                } else if (k > n){
                    throw new kGreaterThanException();
                }
                
                flag =true;
            
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid, enter an integer.");
            } catch (InvalidIntegerException e) {
                System.out.println(e.toString());
            } catch (kGreaterThanException e) {
                System.out.println(e.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (!flag);
        
        return k;

    }

    public static int calTotal(int n, int k) {

        //base case
        if (k == 1) {
            return n;
        }
        if (k == n) {
            return 1;
        }
        return calTotal(n - 1, k) + calTotal(n - 1, k - 1);

    }

}
