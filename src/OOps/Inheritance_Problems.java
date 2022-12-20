package OOps;

//Exercise & Practice Questions on Inheritance
//        Create a class circle and use inheritance to create another class cylinder from it
//        Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
//        Create a method for area and volume in 1
//        create methods for area & volume in 2 also create getters and setters
//        What is the order of constructor execution for the following inheritance hierarchy
//        Base
//        Derived 1
//        Derived 2
//        Derived obj = new Derived 2( );
//        Which constructor(s) will be executed & in what order?

class circle{
 private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double GetArea(){
        double j= (radius*radius) * 3.14159265 ;
        j=Math.round(j*100.0)/100.0;
        return j;
    }
}



class cylinder extends circle{
int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double GetArea(){
        double k = 2*3.14159265*getRadius()*(getRadius()+height);
        k=Math.round(k*100.0)/100.0;
        return k;
    }

}

class rectangle{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int GetArea(){
        return this.height*this.width;
    }
}


class cuboid extends rectangle{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int GetArea(){
        return 2*( ( length * getWidth() ) + ( getWidth() * getHeight() ) + ( length * getHeight() ) );
    }

}



public class Inheritance_Problems {

    public static void main(String[] args) {

      circle circle1 = new circle();
        System.out.println(circle1);

    }
}
