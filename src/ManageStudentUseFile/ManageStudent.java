import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
    List<Student> list = new ArrayList<Student>();

    public void Add (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id :");
        String id = sc.nextLine();
        System.out.println("Input Name :");
        String name = sc.nextLine();
        System.out.println("Input Age :");
        int age = sc.nextInt();
        sc.nextLine();

        list.add(new Student( id, name, age));

    }

    public void Edit(String id)
    {
        Student o = Search(id);
        if ( o != null ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Id :");
            String ID = sc.nextLine();
            System.out.println("Input Name :");
            String name = sc.nextLine();
            System.out.println("Input Age :");
            int age = sc.nextInt();
            sc.nextLine();

            list.set(list.indexOf(o), new Student(ID, name, age));
        }else {
            System.out.println("Empty, not to find the id of student");
        }
    }

    public Student Search(String id)
    {
        for (Student o : list){
            if (o.getId().contains(id)){
                return o;
            }
        }return null;
    }
    public void Delete(String id){
        Student o = Search(id);
        if (o != null){
            list.remove(o);
            System.out.println("Remove completed");
        }else {
            System.out.println("Empty, not to find the id of student");
        }
    }
    public void View(){
        for (Student o : list){
            System.out.println(o.toString());
        }
    }

    public void ReadData() {
        String id, name;
        int age;

        try{

            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
            String line = br.readLine();
            while (line != null){
                String[] value = line.split(",");

                id = value[0];
                name = value[1];
                age = Integer.parseInt(value[2]);

                list.add(new Student(id, name, age));
                line = br.readLine();

            }
            br.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void SaveData(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.csv"));
            for (Student o : list){
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
