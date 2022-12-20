package OOps;

class Triangle{

    private int width;
    private int height;



    public void setHeight(int height) {
        if(height<=0)
            System.out.println("Not Valid Height! Please set a Valid Height (a valid height is more then 0)");
        else
            System.out.println("Set Height Successfully" );
           this.height = height;
    }

    public void setWidth(int width) {
        if(width<=0)
            System.out.println("Not Valid Width! Please set a Valid Width (a valid width is more then 0)");
        else
            System.out.println("Set Width Successfully" );
            this.width = width;

    }

    public int getHeight() {
        if(height==0){
            System.out.println("Height is not set yet Please set a Height first");
            return 0;
        }else{
            return height;
        }
    }

    public int getWidth() {
        if(height==0){
            System.out.println("Height is not set yet Please set a Width first");
            return 0;
        }else{
            return width;
        }
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        Triangle t1 = new Triangle();

        t1.setHeight(0);
        t1.setWidth(0);

        int h1= t1.getHeight();
        int w1= t1.getWidth();

        System.out.println(h1);
        System.out.println(w1);



    }




}
