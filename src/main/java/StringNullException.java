/* Java program to demonstrate
 * exception handling for
 * string is null case
 * while invoking String.charAt method. */

// Main class.
public class StringNullException
{   // Start of main class.

    // Starting point of execution.
    public static void main (String [] args)
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try {

            String a = null; //null value
            System.out.println (a.charAt (0));

        }
        catch (NullPointerException e) {

            System.err.println ("Caught NullPointerException: "
                    + e.getMessage());

        }

    }   // End of execution thread.

}   // End of main class.
