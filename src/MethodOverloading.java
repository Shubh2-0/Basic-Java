public class MethodOverloading {

//    Method Over loading : same method name but different Arguments perameters
   static  int fun(int a, int b){
       return a+b;
   }
   static int fun(int a){
       return a;
   }
    static  int fun(int a,int b, int c){
       return a+b+c;
    }
    static void fun(String b){
        System.out.println(b);
    }

    static void fun(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }


    public static void main(String[] args) {
        int a = 60;
        int b = 50;
        int c = 50;
        int d = 40;
        String t = "Shubham Bhati";

        int fun1 = fun(a);
        System.out.println(fun1);

        int fun2 = fun(a,b);
        System.out.println(fun2);

        int fun3 = fun(a,b,c);
        System.out.println(fun3);

        fun(a,b,d,c);

        fun(t);

    }

}
