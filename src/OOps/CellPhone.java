package OOps;

public class CellPhone {

    String name;
    int price;
    String color;
    String modelNumber;
    String primaryCamera;
    String secondaryCamera;
    String batteryBackup;
    String warranty;
    String ram;
    String rom;

    public CellPhone(String name, int price, String color, String modelNumber, String primaryCamera, String secondaryCamera, String batteryBackup, String warranty, String ram, String rom) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.modelNumber = modelNumber;
        this.primaryCamera = primaryCamera;
        this.secondaryCamera = secondaryCamera;
        this.batteryBackup = batteryBackup;
        this.warranty = warranty;
        this.ram = ram;
        this.rom = rom;
    }

    public static void Ringing(){
        System.out.println("Ringing.....");
    }

    public void Calling(String name){
        System.out.println("Calling....."+name+" By "+this.name);
    }

     public void Messaging(String name){
        System.out.println("Messaging...."+name+" By "+this.name);
    }


    public void GetDetails() {

        System.out.println(
                "\nDetails of "+this.name+" :-"+
                "\nPrice : " + price +
                " , \nColor : " + color +
                " ,\nModelNumber :"  + modelNumber  +
                " , \nPrimaryCamera : " + primaryCamera +
                " , \nSecondaryCamera : " + secondaryCamera +
                " , \nBatteryBackup : " + batteryBackup +
                " , \nWarranty : " + warranty +
                " , \nRam : " + ram +
                " , \nRom : " + rom  );

    }







}
