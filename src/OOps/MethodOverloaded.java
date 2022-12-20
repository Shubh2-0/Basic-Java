package OOps;

class Employees{
   int Salary;
   String Name;
   String City;
   String  MobileNumber;

    public Employees(int salary, String name, String city, String mobileNumber) {
        Salary = salary;
        Name = name;
        City = city;
        MobileNumber = mobileNumber;
    }

    public Employees(String name, String city, String mobileNumber) {
        Salary = 40000;
        Name = name;
        City = city;
        MobileNumber = mobileNumber;
    }
    public Employees(int salary, String name, String mobileNumber) {
        Salary = salary;
        Name = name;
        City = "Indore";
        MobileNumber = mobileNumber;
    }
    public Employees() {
        Salary = 50000;
        Name = "Shubham";
        City = "Indore";
        MobileNumber = "6232133187";
    }


    public void PrintDetails() {
        System.out.println(
                        "Salary : " + Salary +
                        "\nName : " + Name +
                        "\nCity : " + City  +
                        "\nMobileNumber : " + MobileNumber
        );

    }
}

public class MethodOverloaded {

    public static void main(String[] args) {
        Employees em1 = new Employees("Aman","Ujjain","6231982872");
        em1.PrintDetails();

    }


}
