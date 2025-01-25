package exception_handling;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("nonexistentfile.txt"));
        } catch (Exception e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
