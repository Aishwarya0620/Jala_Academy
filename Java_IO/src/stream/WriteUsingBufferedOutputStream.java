package stream;

import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            String text = "Hello, this is written using BufferedOutputStream.";
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

