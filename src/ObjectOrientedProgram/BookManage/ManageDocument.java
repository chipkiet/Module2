package src.ObjectOrientedProgram.BookManage;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageDocument {
    List<Document> list = new ArrayList<>();

    public void Add(){
        Scanner sc = new Scanner(System.in);

        System.out.println("a : Add book ");
        System.out.println("b : Add Magazine ");
        System.out.println("c : Add newspaper ");

        System.out.println("Choose the Document you want to add  :");
        String type = sc.nextLine();
        switch (type) {
            case "a":
                System.out.println("Enter id of Book: ");
                String idBook = sc.nextLine();
                System.out.println("Enter nxb of Book: " );
                String nxbBook  =sc.nextLine();
                System.out.println("Enter number of book");
                int numberBook = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the num Page of book");
                int numPage  = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter book's Author : ");
                String author = sc.nextLine();

                Document book = new Book(idBook, nxbBook, numberBook, author, numPage);
                list.add(book);
                break;

            case "b":
                System.out.println("Enter id of Magazine: ");
                String idMagazine = sc.nextLine();
                System.out.println("Enter nxb of Magazine: " );
                String nxbMagazine  =sc.nextLine();
                System.out.println("Enter number of Magazine");
                int numberMagazine = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the issueNumber of Magazine :");
                int issueNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the month issue of Magazine : ");
                int monthIssue = sc.nextInt();
                sc.nextLine();

                Document magazine = new Magazine(idMagazine, nxbMagazine, numberMagazine, issueNumber, monthIssue);
                list.add(magazine);
                break;

            case "c":
                System.out.println("Enter id of Newspaper: ");
                String idNews = sc.nextLine();
                System.out.println("Enter nxb of Newspaper: " );
                String nxbNews  =sc.nextLine();
                System.out.println("Enter number of Newspaper");
                int numberNews = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the day issue of newspaper :");
                int dayIssue =  sc.nextInt();
                sc.nextLine();

                Document news = new Newspaper(idNews, nxbNews, numberNews, dayIssue);
                break;

            default:
                System.out.println("Invalid");

        }
    }
    public void Remove(String id) {
        Document x = Search(id);
        if (x != null){
            list.remove(x);
            System.out.println("Remove completed");
        }else{
            System.out.println("Can't find the element to remove.");
        }
    }
    public Document Search(String id){

        for (Document x: list){
            if (x.getId().contains(id)){
                return x;
            }
        }
        return null;
    }
    public void View(){
        for (Document x: list){
            System.out.println(x.toString());
        }
    }

}


