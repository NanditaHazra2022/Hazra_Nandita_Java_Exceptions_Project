/* Java program to demonstrate
 * exception handling for
 * access of non-existent string element case. */

// Main class.
public class NonExistentStringElementAccessException
{   // Start of main class.

    // Starting point of execution.
    public static void main (String[] args)
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try {

            String str = "This is like chipping."; // length is 22

            for (int i = 17;
            i<23;
            i++) {
                char c = str.charAt(i); // accessing 25th element
                System.out.println(c);
            }

        }
        catch(StringIndexOutOfBoundsException e) {

            System.err.println("Caught StringIndexOutOfBoundsException: "
                    + e.getMessage());

        }

    }   // End of execution thread.

}   // End of main class.
