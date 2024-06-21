package src.ObjectOrientedProgram.OfficersManage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageOfficer managerOfficer = new ManageOfficer();
        while(true){
            System.out.println("Application Manage Officer");
            System.out.println("1: Add officer");
            System.out.println("2: Search officer");
            System.out.println("3: Show officer");
            System.out.println("4: Exit");

            String choice = scanner.nextLine();
            switch(choice) {
                case "1": {
                    System.out.println("Enter a to add Engineer");
                    System.out.println("Enter b to add Staff");
                    System.out.println("Enter c to add Worker");

                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":
                            System.out.println("Enter Engineer name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter Engineer age :");
                            int age = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter Engineer address: ");
                            String address = scanner.nextLine();
                            System.out.println("Enter Engineer gender:");
                            String gender = scanner.nextLine();
                            System.out.println("Enter Engineer trainingJob:");
                            String trainingJob = scanner.nextLine();

                            Officer engineer = new Engineer(trainingJob, name, age, address, gender);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;

                        case "b":
                            System.out.println("Enter Staff name: ");
                            String officerName = scanner.nextLine();
                            System.out.println("Enter Staff age: ");
                            int officerAge = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter Staff address: ");
                            String officerAddress = scanner.nextLine();
                            System.out.println("Enter Staff gender: ");
                            String officerGender = scanner.nextLine();
                            System.out.println("Enter Staff Task:");
                            String task = scanner.nextLine();

                            Officer staff = new Staff(task, officerName, officerAge, officerAddress, officerGender);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;

                        case "c":
                            System.out.println("Enter Worker name: ");
                            String workerName = scanner.nextLine();
                            System.out.println("Enter Worker age: ");
                            int workerAge = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter Worker address: ");
                            String workerAddress = scanner.nextLine();
                            System.out.println("Enter Worker gender: ");
                            String workerGender = scanner.nextLine();
                            System.out.println("Enter worker level");
                            int level = scanner.nextInt();
                            scanner.nextLine();

                            Officer worker = new Worker(workerName, workerAge, workerAddress, workerGender, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            break;

                        default:
                            System.out.println("Invalid Type");
                            continue;
                    }
                    break;
                }

                case "2": {
                    System.out.println("Enter the name you want to search : ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(System.out::println);
                    break;
                }
                case "3": {
                    managerOfficer.showOfficers();
                    break;
                }
                case "4": {
                    return;

                }
                default:
                    System.out.println("Invalid choice");
                    continue;



            }
        }
    }
}
