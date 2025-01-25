package stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("Hello, this is written using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
