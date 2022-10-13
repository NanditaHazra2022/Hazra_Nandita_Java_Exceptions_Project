/* Java program to demonstrate
 * exception handling for
 * number not divisible by zero case. */

// Main class.
public class NumberNotDivisibleByZeroException
{   // Start of main class.

    // Starting point of execution.
    public static void main (String [] args)
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try {

            int a = 30, b = 0;

            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);

        }
        catch(ArithmeticException e) {

            System.err.println ("Caught ArithmeticException: "
            + e.getMessage());

        }

    }   // End of execution thread.

}   // End of main class.
