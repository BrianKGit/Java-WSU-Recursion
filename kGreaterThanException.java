/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: kGreaterThanException.java
 * Description: Subclass of Exception to handle k greater than n.
 */

public class kGreaterThanException extends Exception{
    private String message;
    
       //constructor
    public kGreaterThanException() {
        this("\nInvalid, k cannot be greater than n.");
    }
    
    public kGreaterThanException( String m ) {
        this.message = m;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    @Override
    public String toString() {
        return message;
    }
}


