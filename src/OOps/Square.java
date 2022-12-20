package OOps;

public class Square {

      int size;

    Square(int size){
        this.size=size;
    }

    public void area(){
        System.out.println("The Area of Squre is " + size*size);
    }

    public int getArea(){
        return size*size;
    }
    public int getPerimeter(){
        return 4*size;
    }

    public void perameter(){
        System.out.println("The PeriMeter of Square is "+ 4*this.size);
    }

}
