public class VariableArguments {
//    Variable_Arguments : one method for different parameter in main method
static void sum(int... arr){
    int total = 0;
    for(int el : arr){
        total+=el;
    }
    System.out.println(total);
}
static  void sum(String... arr){
    for(String el : arr){
        System.out.print(el+" ");
    }
    System.out.println();
}

//this method is showing that show at least one  parameter is compulsory for use or call this method wer can use multiple perameters here
static void sum2(int x,int... arr){
    int result = x;
    for(int el : arr){
        result+=el;
    }
    System.out.println(result);
}

    public static void main(String[] args) {
        sum(1,2,3,4,5);
        sum(3,52,4);
        sum(1,2);
        sum(23,3);
        sum(2,1,4);
        sum(1,62,7,3,7,3);
//        ################################
        sum("Shubham","aman","dev","boby","chinmay");
        sum("good","Morning");
        sum("hello","Shubham");
        sum("hello","Shubham","kaise","ho");

//        ##################################

        sum2(1);
//        sum2() throw error

        sum2(2,2,3,2,23);
        sum2(2,8,2,3);
        sum2(7,2,8,1,5,2,4,7);
    }


}
