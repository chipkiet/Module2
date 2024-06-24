import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ManagePatient mp = new ManagePatient();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("---------------------Menu-----------------");
            System.out.println("1: Add Patient : ");
            System.out.println("2: Delete Patient : ");
            System.out.println("3: Show dsa of patient : ");
            System.out.println("4: Exit : ");

            System.out.println("Hay chon thu ma ban muon: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    mp.AddPatient();
                    break;
                case "2":
                    System.out.println("Sau khi xoa xong, hay nhap 1- c de thuc hien phep xoa len csv");
                    System.out.println("Input the patient Id you need to delete :");
                    String id = sc.nextLine();
                    mp.RemovePatient(id);
                    break;

                case "3":
                    mp.ShowPatient();
                    break;
                case "4":
                    return;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }
        }
    }
}
