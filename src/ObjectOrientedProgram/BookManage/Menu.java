package src.ObjectOrientedProgram.BookManage;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManageDocument md = new ManageDocument();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------Menu---------------------------");
            System.out.println("1: Add student");
            System.out.println("2: Remove student");
            System.out.println("3: Search student");
            System.out.println("4: Show student");

            System.out.println("Enter your choice :");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    md.Add();
                    break;

                case "2" :
                    System.out.println("Enter the ID of document you want to remove:");
                    String id1 = sc.nextLine();
                    md.Remove(id1);
                    break;
                case "3" :
                    System.out.println("Enter the Document ID you want to find : ");
                    String id = sc.nextLine();
                    Document o = md.Search(id);

                    if (o != null){
                        System.out.println(o.toString());
                    }else{
                        System.out.println("I can not find the student id");
                    }
                    break;
                case "5" :
                    md.View();
                    break;
                case "6" :

                    break;
                case "7" :

                    break;

            }

        }
    }
}
