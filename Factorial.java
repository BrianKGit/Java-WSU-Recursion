
import java.util.*;

public class Factorial
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n;
        long result;
        
        System.out.println("Enter a positive integer: ");
        n = console.nextInt();
        
        result = calFactorial ( n );
        
        System.out.println( n + "! = " + result);
          
    }//end main
    
    public static long calFactorial ( int n ) {
    
       //base case
       if( n == 1) {
          return 1;
       }
       
       //smaller version of the original problem
       return n * calFactorial( n - 1);
       
    }//end calFactorial()
    
}//end class

