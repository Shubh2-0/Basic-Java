import java.util.Scanner;
public class detect_Integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
//        System.out.println(sc.hasNextInt());

//        int v= 3;
//        double b=4.6;
//        System.out.format("The of v is %d and the value of n is %f",v,b);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum=a+b;
//        System.out.printf("The sum of %d and %d is %d",a , b ,sum);
//
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = num1+num2;
//        System.out.printf("The sum of %d and %d is %d",num1,num2,num3);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = n*m;
        System.out.format("The multification of %d and %d is %d",n,m,res);



    }
}
