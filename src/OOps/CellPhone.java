package OOps;

public class CellPhone {

    String Name;
    int Price;
    String Color;
    String ModelNumber;
    String PrimaryCamera;
    String SecondaryCamera;
    String BatteryBackup;
    String Warranty;
    String Ram;
    String Rom;

    CellPhone(String name,int Price , String Color , String modelNumber , String primaryCamera , String secondaryCamera , String batteryBackup , String warranty , String ram ,String rom){
    this.Name=name;
    this.Price=Price;
    this.Color=Color;
    this.ModelNumber=modelNumber;
    this.PrimaryCamera=primaryCamera;
    this.SecondaryCamera=secondaryCamera;
    this.BatteryBackup=batteryBackup;
    this.Warranty=warranty;
    this.Ram=ram;
    this.Rom=rom;
    }

    public static void Ringing(){
        System.out.println("Ringing.....");
    }

    public void Calling(String name){
        System.out.println("Calling....."+name+" By "+this.Name);
    }

     public void Messaging(String name){
        System.out.println("Messaging...."+name+" By "+this.Name);
    }


    public void GetDetails() {

        System.out.println(
                "\nDetails of "+this.Name+" :-"+
                "\nPrice : " + Price +
                " , \nColor : " + Color +
                " ,\nModelNumber :"  + ModelNumber  +
                " , \nPrimaryCamera : " + PrimaryCamera +
                " , \nSecondaryCamera : " + SecondaryCamera +
                " , \nBatteryBackup : " + BatteryBackup +
                " , \nWarranty : " + Warranty +
                " , \nRam : " + Ram +
                " , \nRom : " + Rom  );

    }







}
