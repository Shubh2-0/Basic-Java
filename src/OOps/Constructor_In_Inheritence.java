package OOps;

class GrandParent{
    GrandParent(){
        System.out.println("I am constructor of grandparent class");
    }
    GrandParent(int n){
        System.out.println("I am PeraMetarais constructor of grandparent class");
    }

    public void printG(){
        System.out.println("I am Method of GrandFather Class");
    }

}

abstract class Parent extends GrandParent{
    Parent(){
        System.out.println("I am constructor of parent class");
    }
    Parent(int k){
        super(k);
        System.out.println("I am PeraMetarais constructor of parent class");
    }

}

class Child extends Parent{
    Child(){
        System.out.println("I am constructor of child class");
    }
    Child(int h){
        super(h);
        System.out.println("I am PeraMeterais constructor of child class");
    }
}





public class Constructor_In_Inheritence {
    public static void main(String[] args) {

        Child c1 = new Child(5);
        c1.printG();

    }
}
