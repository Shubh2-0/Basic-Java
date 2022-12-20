public class chnaging {
    static void change(int i){
        i=50;
    }
    static void change2(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
    }

    public static void main(String[] args) {
        int i=40;
        change(i);
        System.out.println(i);
    int[] arr = {10,20,30,40,50,60};
    change2(arr);
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }

    }
}
