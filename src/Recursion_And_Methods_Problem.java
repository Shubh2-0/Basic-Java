public class Recursion_And_Methods_Problem {
    static void  table(int num){
       int i=1;
        while(i<11){
            System.out.println(i*num);
            i++;
        }





    }

    static void pattern1(int n){
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }


    }

    static int sum(int i){
    if(i==1){
        return 1;
    }else{
        return i+sum(i-1);
    }


    }

    static void pattern2(int num){

        for (int i=num;i>0;i--){
        for (int j=0;j<i;j++){
            System.out.print("* ");
        }
            System.out.println();

        }

    }

    static int fin(int n){
    if(n==1){
        return 0;
    } else if (n==2) {
        return 1;
    }else {
        return fin(n-1)+fin(n-2);
    }


    }

    static void pattern1_rec(int i){

     if(i>0){
         pattern1_rec(i-1);
         for (int j=0;j<i;j++){
             System.out.print("* ");
         }
         System.out.println();
     }


    }

    static void temp(int cel){

        System.out.println((cel * 1.8) + 32);

    }

    public static void main(String[] args) {
// 1.Write a Java method to print the multiplication table of a number n.
//        int num = 2;
//        table(num);

//    2.Write a program using functions to print the following pattern:
//           *
//           **
//          ***
//         ****
//        pattern1(5);

//       3.Write a recursive function to calculate the sum of first n natural numbers.?
//        int k = sum(10);
//        System.out.println(k);

//        4.Write a function to print the following pattern:
//         ****
//         ***
//         **
//         *
//          int num = 5;
//          pattern2(num);

//        5.Write a function to print the nth term of the Fibonacci series using recursion.
//            int ans = fin(10);
//        System.out.println(ans);

        //    2.Write a program using functions to print the following pattern:
//          WITH RECURSiON
//           *
//           **
//          ***
//         ****
//        pattern1(5);

//        pattern1_rec(5);

//        6.Write a function to convert Celsius temperature into Fahrenheit.

          temp(20);
    }


}
