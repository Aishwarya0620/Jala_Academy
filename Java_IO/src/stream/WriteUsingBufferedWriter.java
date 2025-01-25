package stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, this is written using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

