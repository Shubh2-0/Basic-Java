import java.util.Scanner;
public class CGPA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks 1");
        int m1 = sc.nextInt();

        System.out.println("Enter marks 2");
        int m2 = sc.nextInt();

        System.out.println("Enter marks 3");
        int m3 = sc.nextInt();

        int total = m2+m1+m3;

        float cgpa = total/3;

        System.out.println("Your CGPA is "+cgpa);



    }

}
