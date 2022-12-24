import  java.util.Scanner;
public class Km_To_M {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter KiloMeter");
    float km = sc.nextFloat();

    double m = km*1000;

        System.out.println("Total Meter is "+m);


    }
}

