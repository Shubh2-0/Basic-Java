public class MUltiDimentional_Array {

    public static void main(String[] args) {
     int[][] matirx = new int[3][5];

     for(int i=0;i<matirx.length;i++){

     for(int j=0;j<5;j++){
       matirx[i][j]=i+j;
     }
     }

    for(int[] arr : matirx){
    for(int el : arr){
        System.out.print(el+" ");
    }
        System.out.println();
    }


    }

}
