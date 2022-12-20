import java.util.Scanner;
public class MarkSheet {

    public static void main(String[] args) {

        System.out.println("Welcome To Shubham School");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark 1");
        int mark1 = sc.nextInt();
        System.out.println("Enter mark 2");
        int mark2 = sc.nextInt();
        System.out.println("Enter mark 3");
        int mark3 = sc.nextInt();
        System.out.println("Enter mark 4");
        int mark4 = sc.nextInt();
        System.out.println("Enter mark 5");
        int mark5 = sc.nextInt();
        int sum =mark1+mark2+mark3+mark4+mark5;
        int result = sum*100/500 ;
        System.out.println("Your Got "+result+" Percentage");





    }


}
