/*
 * Author: Brian Klein
 * Date:10/11/17
 * Program: InvalidIntegerException.java
 * Description: Subclass of Exception to handle integers less than zero.
 */

/**
 *
 * @author Owner
 */
public class InvalidIntegerException extends Exception {
    
    private String message;
    
       //constructor
    public InvalidIntegerException() {
        this("\nInvalid, number must be greater than zero.");
    }
    
    public InvalidIntegerException( String m ) {
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
