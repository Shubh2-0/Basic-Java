public class Java_Recursion {
//    Recursion => Method (Function) call itself again and again

        static int factorial(int n){

    if(n==1 || n==0){
        return 1;
    }
    else{
        System.out.println(n);
        return n*factorial(n-1);
    }


    }

        static void show(String str){
        if(str.length()==0){
            System.out.println("Empty!");
        }
        else{
            if(str.startsWith("am")){
                System.out.println("Matches");
                return;
            }
            System.out.println(str);
            str=str.substring(1,
                    str.length());
            show(str);
        }


        }


    public static void main(String[] args) {

//        int b=2;
//        int n = factorial(5);
//        System.out.println(n);

        show("Shubham");
    }


}
