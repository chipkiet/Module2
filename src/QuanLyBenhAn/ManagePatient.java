import checkCode.CodeChecker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagePatient {
    List<Patient> list = new ArrayList<Patient>();

    private boolean isIdExist(String id) {
        for (Patient o : list) {
            if (o.getId().contains(id)) {
                return true;
            }
        }
        return false;
    }

    public void AddPatient() {
        Scanner sc = new Scanner(System.in);

        System.out.println("a: Normal Patient Add");
        System.out.println("b: VIP Patient Add");
        System.out.println("c: Dua cac du lieu len file data: ");

        System.out.println("Choose the type of patient");
        String type = sc.nextLine();


        switch (type) {
            case "a":
                    boolean Value = false;
                    while (!Value) {
                        try {

                            System.out.println("Nhap so thu tu cua benh nhan  :");
                            int stt = sc.nextInt();
                            sc.nextLine();


                            System.out.println("Nhap ma benh an cua benh nhan (BA-XXX)  : ");
                            String id = sc.nextLine();
                            if (isIdExist(id)) {
                                throw new DuplicateMedicalRecordException("Benh an da ton tai: ");
                            }

                            System.out.println("NHap ten cua benh nhan : ");
                            String name = sc.nextLine();
                            System.out.println("Nhap ngay nhap vien cua benh nhan:");
                            int dayIn = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nhap ngay xuat vien cua benh nhan : ");
                            int dayOut = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nhap ly do nhap vien :");
                            String reason = sc.nextLine();
                            System.out.println("Nhap vao phi nhap vien :");
                            int cost = sc.nextInt();
                            sc.nextLine();
                            Patient pNormal = new NormalPatient(stt, id, name, dayIn, dayOut, reason, cost);
                            list.add(pNormal);

                            saveToFile();

                            Value = true;
                        }catch (DuplicateMedicalRecordException e){
                            System.out.println(e.getMessage() + "Input again");
                        }catch (Exception e){
                            System.out.println("Input again cause invalid or error");
                            sc.nextLine();
                        }
                    }
                    break;



            case "b":
                System.out.println("Nhap so thu tu cua benh nhan :");
                int stt1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ma benh an cua benh nhan (BA-XXX) : ");
                String id1 = sc.nextLine();


                System.out.println("NHap ten cua benh nhan : ");
                String name1 = sc.nextLine();
                System.out.println("Nhap ngay nhap vien cua benh nhan:");
                int dayIn1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ngay xuat vien cua benh nhan : ");
                int dayOut1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap ly do nhap vien :");
                String reason1 = sc.nextLine();
                System.out.println("Nhap loai Vip :");
                String vip = sc.nextLine();
                System.out.println("Nhap thoi gian Vip hoat dong : ");
                int vipTime = sc.nextInt();
                sc.nextLine();
                Patient pVip = new VipPatient(stt1, id1, name1, dayIn1, dayOut1, reason1, vip, vipTime);
                list.add(pVip);
                saveToFile();
                break;

        }
    }
    public Patient Search(String id){
        for (Patient o : list) {
            if (o.getId().contains(id)){
                return o;
            }
        }
        return null;
    }

    public void RemovePatient(String id) {
        Patient x = Search(id);
        if (x != null){
            list.remove(x);
        }else {
            System.out.println("Cannot find the id to delete: ");
        }
        saveToFile();


    }

    public void ShowPatient() {
        for (Patient o : list) {
            System.out.println(o.toString());
        }
    }
    public void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data/medical_records.csv"));
            for (Patient o : list) {
                bw.write(o.toString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

