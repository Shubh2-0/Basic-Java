package OOps;

public class Circle {
    int Radius;
    String Name;

    Circle(String Name, int Radius){
        this.Name=Name;
        this.Radius=Radius;
    }

    public float GetArea(){
        return 3.14f  * (Radius*Radius);
    }
    public double GetPerimeter(){
        double j = 2 * 3.14159  * Radius;
        j=Math.round(j*100.0)/100.0;
        return j;
    }

    public void PrintArea(){
        System.out.println("The Area of "+Name+" is "+GetArea());
    }
    public void PrintPeriMeter(){
        System.out.println("The PeriMeter of "+Name+" is "+GetPerimeter());
    }



}
