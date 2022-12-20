package OOps;

class parent1{

    public void print(){
        System.out.println("I am Print Method of class parent 1");
    }

    public void sum(int a,int b){
        System.out.println("Parent1 Method of a+b = "+ (a+b));
    }

}

class child1 extends parent1{
    @Override
    public void print(){
        System.out.println("I am Print Method of class child 1");
    }

    public void sum(int a,int b){
        System.out.println("child1 Method of a*b = "+ a*b);
    }


}

public class MethodOverRiding {
    public static void main(String[] args) {

     parent1 p1 = new parent1();
     child1 c1 = new child1();

     p1.print();
     c1.print();
     c1.sum(3,4);
     p1.sum(3,4);


    }

}
