package OOps;

public class Rectangle {


    int width;
    int height;
    String name;

    Rectangle(String name,int width, int height){
        this.name=name;
        this.width=width;
        this.height=height;
    }

    public void printArea(){
        System.out.println("The Area of "+name+" is "+ GetArea()  );
    }
    public void printPerimeter(){
        System.out.println("The PeriMeter of "+name+" is "+ GetPerimeter());
    }
    public int GetArea(){
        return height*height;
    }
    public int GetPerimeter(){
        return 2*(height+width);
    }


    public void setHeight() {
    }
}
