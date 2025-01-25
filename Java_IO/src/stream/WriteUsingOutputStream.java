package stream;


import java.io.IOException;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Hello, this is written using OutputStream.";
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
