package OOps;

public class Circle {
    int radius;
    String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public float GetArea(){
        return 3.14f  * (radius*radius);
    }
    public double GetPerimeter(){
        double j = 2 * 3.14159  * radius;
        j=Math.round(j*100.0)/100.0;
        return j;
    }

    public void PrintArea(){
        System.out.println("The Area of "+name+" is "+GetArea());
    }
    public void PrintPeriMeter(){
        System.out.println("The PeriMeter of "+name+" is "+GetPerimeter());
    }



}
