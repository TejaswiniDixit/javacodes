import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileHandler file = new FileHandler("notes.txt");
            System.out.println("File opened successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error while opening file: " + e.getMessage());
        }
    }
}

class FileHandler {
    FileHandler(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new IOException("File not found: " + fileName);
        } else {
            System.out.println("Accessing file: " + fileName);
        }
    }
}
