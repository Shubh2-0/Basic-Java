import java.util.Scanner;
public class methods {
    boolean check(int num){
if(num==1)
    return false ;
for(int i=2;i<num;i++){
    if(num%i==0)
        return false ;
}

return true;

}

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        methods obj = new methods();
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){

        if(obj.check(i))
            System.out.println(i+" is a Prime Number");
        else
            System.out.println(i+" is not a Prime Number");
        }


    }

}
