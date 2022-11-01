/* Java program to demonstrate
 * exception handling for the case
 * where a non-existent index
 * of an array is accessed.  */

// Main class.
public class NonExistentArrayIndexAccessException
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try {

            // Creating integer array.
            int[] arr = {1, 2, 3, 4, 5};

            // for loop to print array elements.
            for (
                    int i = 3;
                    i < 10;
                    i++
            ) {
                System.out.println(arr[i]);
            }


        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.err.println ("Caught ArrayIndexOutOfBoundsException: "
            + e.getMessage());

        }

    }   // End of execution thread.

}   // End of main class.
