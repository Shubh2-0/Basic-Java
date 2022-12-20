package OOps;



class Vehicles{

    String Color;
    int Price;
    String Number;
    int ManufactureYear;
    String Average;

    public Vehicles(String color, int price, String number, int manufactureYear, String average) {
        Color = color;
        Price = price;
        Number = number;
        ManufactureYear = manufactureYear;
        Average = average;
    }
}

class Bike extends Vehicles{
    boolean TwoSeater;
    int TotalWeals;
    boolean helmet;

    public Bike(String color, int price, String number, int manufactureYear, String average, boolean twoSeater, int totalWeals, boolean helmet) {
        super(color, price, number, manufactureYear, average);
        TwoSeater = twoSeater;
        TotalWeals = totalWeals;
        this.helmet = helmet;
    }

    public void PrintDetails() {
        System.out.println("the following properties of Bike are : -" +
                        " \nTwoSeater          :   " + TwoSeater +
                        " \n TotalWeals        :   " + TotalWeals +
                        " \n helmet            :   " + helmet +
                        " \n Color             :   " + Color +
                        " \n Price             :   " + Price +
                        " \n Number            :   " + Number +
                        " \n ManufactureYear   :   " + ManufactureYear +
                        " \n Average           :   " + Average);

    }
}


class Car extends Vehicles {
    boolean CNG;
    boolean Petrol;

    int NumberOfSeats;

    boolean SitBelt;

    public Car(String color, int price, String number, int manufactureYear, String average, boolean CNG, boolean petrol, int numberOfSeats, boolean sitBelt) {
        super(color, price, number, manufactureYear, average);
        this.CNG = CNG;
        Petrol = petrol;
        NumberOfSeats = numberOfSeats;
        SitBelt = sitBelt;
    }

    public void PrintDetails() {
        System.out.println("The Properties of Car are :-" +
                "\nCNG            :   " + CNG +
                "\nPetrol          :   " + Petrol +
                "\nNumberOfSeats   :   " + NumberOfSeats +
                "\nSitBelt         :   " + SitBelt +
                "\nColor           :   " + Color +
                "\nPrice           :   " + Price +
                "\nNumber          :   " + Number +
                "\nManufactureYear :   " + ManufactureYear +
                "\nAverage         :   " + Average
        );
    }
}
    class Truck extends Vehicles{
        boolean BlowHornSticker;
        int NumberOfWheals;
        int Hieght;
        String Type;

        public Truck(String color, int price, String number, int manufactureYear, String average, boolean blowHornSticker, int numberOfWheals, int hieght, String type) {
            super(color, price, number, manufactureYear, average);
            BlowHornSticker = blowHornSticker;
            NumberOfWheals = numberOfWheals;
            Hieght = hieght;
            Type = type;
        }


        public void PrintDetails() {
            System.out.println("The Properties of Truck are :-"+
                            "\nBlowHornSticker    :  " + BlowHornSticker +
                            "\nNumberOfWheals     :  " + NumberOfWheals +
                            "\nHieght             :  " + Hieght +
                            "\nType               :  " + Type +
                            "\nColor              :  " + Color +
                            "\nPrice              :  " + Price +
                            "\nNumber             :  " + Number +
                            "\nManufactureYear    :  " + ManufactureYear +
                            "\nAverage            :  " + Average
                    );


        }
    }









public class Inheritence {

    public static void main(String[] args) {

        Bike bike1 = new Bike("black",70000,"MH-3249",2013,"55KM/HHS",true,2,true);
        bike1.PrintDetails();
        Car car1 = new Car("Blue",500000,"GH-2671",2001,"20KM/HRS",true,true,6,true);
        car1.PrintDetails();
        Truck truck1 = new Truck("White",3000000,"DS-2=5630",2005,"10KM/HRS",true,8,10,"Jumbo");
        truck1.PrintDetails();

    }


}
