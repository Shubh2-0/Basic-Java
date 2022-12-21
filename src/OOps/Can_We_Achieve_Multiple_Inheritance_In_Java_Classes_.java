package OOps;

class Father{
    int salary;
    int age;

    public void show1(){
        System.out.format("Your Age is d% and your Salary is %d",salary,age);
        System.out.println();
//
    }

}

class Mother{
    String name;
    String city;

    public void show2(){
        System.out.format("Your Name is %s and your City is %s",name,city);
    }
}

//class son extends father,Mother{  NOT ALLOWED(MULTIPLE INHERITANCE)
//
//}

//class son extends father{}   ALLOWED



public class Can_We_Achieve_Multiple_Inheritance_In_Java_Classes_ {
}
