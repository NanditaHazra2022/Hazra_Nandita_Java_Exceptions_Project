/* Java program to demonstrate
 * exception handling for
 * file does not exist case. */

// Importing required classes.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Main class.
public class FileDoesNotExistException
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // try-catch block for exception handling.
        try
        {   // Start of try block.

            // Following file does not exist.
            File file = new File("E://file.txt");

            // Java in-built class to read file.
            FileReader fr = new FileReader(file);
            System.out.println("Reading char by char : \n");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }   // End of try block.
        catch (FileNotFoundException e)
        {   // Start of catch block.
            System.err.println("In the Catch block for file not found exception.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("In the Catch block for input/output exception.");
            throw new RuntimeException(e);
        }   // End of catch block.

    }   // End of execution thread.

}   // End of main class.
