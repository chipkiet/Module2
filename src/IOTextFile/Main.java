package CodeGym.src.IOTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Van Minh Ram", 1, 9);
//        Student s2 = new Student("Le Thi Me Hao", 2, 9);
//        Student s3 = new Student("Van Ba Ty", 3, 9);
//        Student s4 = new Student("Van Minh Chip", 4, 9);
//
//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);

        try{
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            PrintWriter pw = new PrintWriter(fw);
            pw.print("Van Minh Chip ");
            pw.println(19);

            pw.print("Van Minh Ram ");
            pw.print(15);



//            for (Student o : list){
//                bw.write(o.toString());
//                bw.newLine();
//            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
