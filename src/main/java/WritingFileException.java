/* Java program to create a list
* in an output file.
* For exception handling,
* try, catch and finally block are used.
* catch block will handle two types of exception.
* finally block will close the output file. */

// Importing required classes.
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

// Main class.
public class WritingFileException
{ // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of main thread.

        // Declaring and initializing variable.
        final int LENGTH = 10; // Length of an array.

        // Creating array of numbers.
        int [] arr = {
                8888,
                100,
                275,
                5000,
                950,
                630,
                48,
                10020002,
                755678,
                32
        };

        // Declaring and initializing PrintWriter variable.
        PrintWriter outputFile = null;

        // try-catch-finally block for exception handling.
        try {

            System.out.println(
                    "Creating list of numbers in an output file using PrintWriter."
            );

            // Writing in a file.
            outputFile = new PrintWriter(new FileWriter("Integer_Array.txt"));

            /* Using for loop
            * to iterate forward
            * in an array.*/
            for (int i = 0;
                 i < LENGTH;
                 i++) {

                // Writing to a file.
                outputFile.println("Value at Array index "
                        + i
                        + " = "
                        + arr[i]
                );

            }

        } catch (IndexOutOfBoundsException e) {

            System.err.println("Caught IndexOutOfBoundsException: "
                    +  e.getMessage());

        } catch (IOException e) {

            System.err.println("Caught IOException: "
                    +  e.getMessage());

        } finally {

            if (outputFile != null) {

                System.out.println("Closing PrintWriter.");
                outputFile.close();

            }
            else {

                System.out.println("PrintWriter not open.");

            }

        }   // End of try-catch-finally block.

    }   // End of execution thread.

}   // End of main class.
