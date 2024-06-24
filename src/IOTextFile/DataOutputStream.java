package CodeGym.src.IOTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataOutputStream {
    public static void main(String[] args) {
        Student s1 = new Student("Van Minh Chip", 5, 6);
        Student s2 = new Student("Van Minh Ram", 4, 8);
        Student s3 = new Student("Van Minh Ty", 3, 7);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);


        try{


            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Student o : list){
                bw.write(o.toString());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileInputStream fis = new FileInputStream("data.txt")){
            int data;
            while((data = fis.read()) != -1){
                System.out.println((char)data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
