import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManageStudent ms = new ManageStudent();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("-----------------------------------Menu-------------------------------");
            System.out.println("1 : Add student");
            System.out.println("2 : Edit student");
            System.out.println("3 : Remove student");
            System.out.println("4 : Find student");
            System.out.println("5 : Print list student");
            System.out.println("6 : Doc data vao File");
            System.out.println("7 : Ghi vao File");
            System.out.println("8 : Out");
            System.out.println("-----------------------------------------------------------------------");

            System.out.println("Enter your choice  :");
            String choice = sc.nextLine();
            switch (choice){
                case "1" :
                    ms.Add();
                    break;
                case "2" :
                    System.out.println("Input the student ID : ");
                    String id = sc.nextLine();
                    ms.Edit(id);
                    break;
                case "3" :
                    System.out.println("Input the student Id you need to delete :");
                    String id1 = sc.nextLine();
                    ms.Delete(id1);
                    break;
                case "4" :
                    System.out.println("Input the student id you need to find :" );
                    String id2 = sc.nextLine();
                    Student o = ms.Search(id2);
                    if (o != null){
                        System.out.println(o.toString());
                    }else {
                        System.out.println("Empty, cannot find the student id");
                    }

                    break;
                case "5" :
                    ms.View();

                    break;

                case "6" :
                    ms.ReadData();
                    break;

                case "7":
                    ms.SaveData();
                    break;
                case "8" :
                    return;


                default:
                    System.out.println("Invalid :");
                    continue;
            }
        }
    }
}
