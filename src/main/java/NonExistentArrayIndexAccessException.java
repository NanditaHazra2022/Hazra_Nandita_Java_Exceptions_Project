/* Java program to demonstrate
 * exception handling for the case
 * where a non-existent index
 * of an array is accessed.  */

// Main class.
public class NonExistentArrayIndexAccessException
{   // Start of main class.

    // Starting point of execution.
    public static void main(String args[])
    {   // Start of execution thread.

        // try-catch block for exception handling
        try {

            int array [] = {1, 2, 3, 4, 5};

            array[6] = 9; // accessing 7th element in an array of size 5

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println ("Array index is out of bounds.");

        }

    }   // End of execution thread.

}   // End of main class.
