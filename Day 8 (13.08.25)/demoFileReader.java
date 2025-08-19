import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class demoFileReader {
    public static void main(String[] args) {
        // Check if a file name is provided
        if (args.length == 0) {
            System.out.println(" Error: Please provide a file name as a command-line argument.");
            return;
        }

        File file = new File(args[0]);

        // Check if the file exists
        if (!file.exists()) {
            System.out.println(" Error: File not found - " + args[0]);
            return;
        }

        // Read and display file content
        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
