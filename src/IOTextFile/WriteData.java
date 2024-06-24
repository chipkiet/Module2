package CodeGym.src.IOTextFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("helio.txt");
            if (file.exists()) {
                System.out.println("File already exists");
                System.exit(1);
            }
            PrintWriter pw = new PrintWriter(file);

            pw.println("Van Minh Chip");
            pw.println(19);

            pw.println("Van Minh Ram");
            pw.println(15);

            pw.close();
        }catch (Exception e){

        }
    }
}
