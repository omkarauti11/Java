import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}

public class _66_Throws {

    public static void main(String[] args) {

        FileReaderExample example = new FileReaderExample();
        try {
            example.readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

}
