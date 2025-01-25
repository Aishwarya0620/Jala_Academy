package stream;

import java.io.FileReader;
import java.io.IOException;

public class ReadUsingFileReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


