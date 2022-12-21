package OOps;

interface Bicycle{
  public void Break(int num);
  public void Speed(int num);
}

interface Moter{
    public void PowerUp(int num);
    public void AutoBreak(int num);
}


class ranger implements Bicycle ,Moter {
    public void Break(int num){
        System.out.println("Speed Decrease By "+num);
    }

    public void Speed(int num){
        System.out.println("Speed Up By "+num);
    }

    public void PowerUp(int num){
        System.out.println("Cycle PowrUp By "+num);
    }

    public void AutoBreak(int num){
      if(num==0){
          System.out.println("Auto Break OFF");
      }
      else if(num==1){
          System.out.println("Auto Break ON");
      }else{
          System.out.println("Command Not Found");
      }


    }

}




public class Interface_In_Java {

    public static void main(String[] args) {

       ranger cycle1 = new ranger();
       cycle1.Break(4);
       cycle1.Speed(10);
       cycle1.AutoBreak(9);
       cycle1.PowerUp(30);


    }

}
