import java.util.Scanner;
public class NonStaticMethod {
//    non static are those method in which we can use only making the object means if we want tom use non static method, so first we have to make an object of respective class
//    afterthat we can call the method by object name only
public void fun(int i){
     for(int j=1;j<11;j++){

         System.out.println(j+" * "+i+" = "+j*i);

     }
 }

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        NonStaticMethod obj = new NonStaticMethod();
        int i = sc.nextInt();
        obj.fun(i);
    }
}
