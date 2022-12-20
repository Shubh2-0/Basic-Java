import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 numbers");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int el : arr){
            System.out.println(el);
        }

    }

}
