public class ArraysProblems {
    public static void main(String[] args) {

//     1. Create an array of 5 floats and calculate their sum.
        float sum=0;
        float[] arr={1.5f , 1.5f , 1.5f , 1.5f , 1.5f};
        for(float el : arr){
            sum+=el;
        }
        System.out.println(sum);

//     2.   Write a program to find out whether a given integer is present in an array or not.
        int[] arr1 = {1,2,3,4,5};
        int n=10;
        int count=0;
        for(int el:arr1){
            if(el==n){
                count=1;
                break;
            }
        }
        if(count==0)
            System.out.println("Not Present");
        else
            System.out.println("Yes This element is present");


        

    }


}
