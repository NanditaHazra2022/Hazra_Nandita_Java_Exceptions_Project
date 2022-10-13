/* Java program to demonstrate
 * exception handling for
 * file does not exist case. */

// Importing required classes.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Main class.
public class FileDoesNotExistException
{   // Start of main class.

    // Starting point of execution.
    public static void main(String args[])
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try {

            // Following file does not exist.
            File file = new File("E://file.txt");
            FileReader objFileReader = new FileReader(file);
        }
        catch (FileNotFoundException e) {

            System.err.println("Caught FileNotFoundException: "
                    + e.getMessage());

        }

    }   // End of execution thread.

}   // End of main class.
