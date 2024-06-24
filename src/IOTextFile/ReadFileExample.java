package CodeGym.src.IOTextFile;

import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("data.txt")) {
            int data;
            while ((data = fr.read()) != -1){
                System.out.println((char)data);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
