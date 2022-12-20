import java.util.Scanner;
public class staticMethod {
//    basically static method are those kind of methods which we call without creating a object
    static void fun(int i){
    for(int j=1;j<11;j++){
        System.out.println(j+" * "+i+" = "+j*i);
    }

    }
    public static void main(String[] args) {

        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fun(i);


    }


}
