import java.util.Scanner;
public class loops {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//        Question 1: Write a program to print the following pattern :
//        ****
//        ***
//        **
//        *
//       int n=4;
//        for(int i=0;i<n;i++){
//         StringBuilder bag = new StringBuilder();
//         for(int j=i;j<n;j++){
//          bag.append("*");
//         }
//            System.out.println(bag);
//
//
//        }

//        Question 2: Write a program to sum first n even numbers using a while loop.
//        int p=30;
//        for(int i=1;i<=p;i++){
//            if(i%2==0)
//                System.out.println(i);
//        }

//        Question 3: Write a program to print the multiplication table of a given number n.

//        System.out.println("Enter the Number That You want Table");
//
//        int num = sc.nextInt();
//        for(int i=1;i<11;i++){
//            System.out.println(i*num);
//        }

////        Question 4: Write a program to print a multiplication table of 10 in reverse order.
//        System.out.println("Enter the number that you want reverse table");
//        int num1 = sc.nextInt();
//        for (int i=10;i>=1;i--){
//            System.out.println(i*num1);
//        }

//        Question 5: Write a program to find the factorial of a given number using for loops.
        System.out.println("Enter number that you want Factorial");
        int j=sc.nextInt();
        int product=1;
        for (int i=1;i<=j;i++){
            product*=i;
        }
        System.out.println("the factorial of "+j+" is "+product);
    }
}
