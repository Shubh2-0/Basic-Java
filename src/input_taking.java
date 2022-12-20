import java.util.Scanner;
public class input_taking {

    public static void main(String[] args) {
        System.out.println("Taking Input");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=sc.nextInt();
        System.out.println("enter number 2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of number 1 and number 2 id "+sum );

        System.out.println("Now enter your age");
        Byte age = sc.nextByte();
        System.out.println("Your age is"+age);

        System.out.println("Enter your firstname");
        String name = sc.next();
        System.out.println("Enter your lastname");
        String name2 = sc.next();
        System.out.println("Your Full Name is "+ name+" "+name2);







    }
}
