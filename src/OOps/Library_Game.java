package OOps;

//You have to implement a library using Java Class "Library"
//
//        Methods: addBook, issueBook, returnBook, showAvailableBooks
//        Properties: Array to store the available books,
//        Array to store the issued books
import javax.xml.namespace.QName;
import  java.util.Scanner;

class Library {

    int size;
    String[] Books;
    int count = 0;





    Library(){
        System.out.println("Provide a size of Library");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Books = new String[size];

    }

    public void issueBook() {
        if (count < Books.length) {
            System.out.println("Enter Book Name");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            Books[count] = name;
            count++;
            System.out.println("Book Successfully Added");
            System.out.println();
        } else {
            System.out.println("Library is Full Now");
            System.out.println();
        }

    }

    public void showAvailableBooks() {
        System.out.println("Available Books are :-");
       for(int i=0;i<count;i++){
           System.out.println(Books[i]);
       }

        System.out.println("##################################");

    }



}


public class Library_Game {
    public static void main(String[] args) {

        Library l1 = new Library();



        Scanner scan = new Scanner(System.in);

        System.out.println("press 1 for Isueing The Book");
        System.out.println("press 2 for Show All The Book");
        System.out.println("press 0 for Exit");

        int b = scan.nextInt();

        if(b==1){
            String name = scan.nextLine();
            l1.issueBook();
        }else if(b==2){
            l1.showAvailableBooks();
        }else {
            System.out.println("Visit Again");
        }

        while (b!=0){
            System.out.println("press 1 for Isueing The Book");
            System.out.println("press 2 for Show All The Book");
            System.out.println("press 0 for Exit");
            b = scan.nextInt();
            if(b==1){
                String name = scan.nextLine();
                l1.issueBook();
            }else if(b==2){
                l1.showAvailableBooks();
            }else {
                b=0;
                System.out.println("Visit Again");
                break;
            }
        }











    }
}
