/* Java program to create a list
* in an output file.
* For exception handling,
* try, catch and finally block are used.
* catch block will handle two types of exception.
* finally block will close the output file. */

// importing required classes
import java.io.*;

// main class
public class CreateListInAnOutputFile {

    // starting point of execution
    public static void main(String[] args) {

        // declaring and initializing variable
        final int SIZE = 10;

        //creating array of numbers
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

        // declaring and initializing PrintWriter variable
        PrintWriter outputFile = null;

        // exception handling
        try {

            System.out.println(
                    "Creating list of numbers in an output file using PrintWriter"
            );

            // writing in an output file
            outputFile = new PrintWriter(new FileWriter("OutputFile_CreateList.txt"));

            for (int i = 0; i < SIZE; i++) {

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

                System.out.println("Closing PrintWriter");

                outputFile.close();

            }
            else {

                System.out.println("PrintWriter not open");

            }

        }

    }

}
