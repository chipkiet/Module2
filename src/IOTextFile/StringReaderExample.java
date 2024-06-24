package CodeGym.src.IOTextFile;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {
    public static void main(String[] args) {
        String data = "Hello, world";
        try (StringReader sr = new StringReader(data)){
            int character;
            if ((character = sr.read()) != -1){
                System.out.println((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
