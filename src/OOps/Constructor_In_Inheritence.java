package OOps;

class grandparent{
    grandparent(){
        System.out.println("I am constructor of grandparent class");
    }
    grandparent(int n){
        System.out.println("I am PeraMetarais constructor of grandparent class");
    }

    public void printg(){
        System.out.println("I am Method of GrandFather Class");
    }

}

abstract class parent extends grandparent{
    parent(){
        System.out.println("I am constructor of parent class");
    }
    parent(int k){
        super(k);
        System.out.println("I am PeraMetarais constructor of parent class");
    }

}

class child extends parent{
    child(){
        System.out.println("I am constructor of child class");
    }
    child(int h){
        super(h);
        System.out.println("I am PeraMeterais constructor of child class");
    }
}





public class Constructor_In_Inheritence {
    public static void main(String[] args) {

        child c1 = new child(5);
        c1.printg();

    }
}
