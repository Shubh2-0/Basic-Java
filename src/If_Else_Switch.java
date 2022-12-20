import java.util.Scanner;
public class If_Else_Switch {
    public static void main(String[] args) {

//        Question 1 : What will be the output of this program:

       int age = 11;
       if(age==11)
           System.out.println("I am 11");
       else
           System.out.println("I am not 11");


//        Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int sum=m1+m2+m3;
        int result = sum*100/300;
        if (result>40 && m1>33 && m2>33 && m3>33)
            System.out.println("You are pass");
        else
            System.out.println("You are fail");
//
//        Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//
//        Income Slab	Tax

//        2.5L – 5.0L  	5%
//        5.0L – 10.0L 	20%
//        Above 10.0L 	30%

        System.out.println("Enter Your Income");
        int salary = sc.nextInt();

       if(salary<250000 && salary<500000){
           int tax = salary*5/100;
           System.out.format("Tax is %d",tax);
       } else if (salary>500000 && salary<1000000) {
           int tax = salary*20/100;
           System.out.printf("Tax is %d",tax);
       } else if (salary>1000000) {
           int tax = salary*30/100;
           System.out.printf("Tax is %d",tax);
       }else{
           System.out.println("Not Eligible for Paying Tax");
       }

        System.out.println();

//        Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]?
        System.out.println("Enter day");
        int day = sc.nextInt();

       switch (day){

           case 1:
               System.out.println("Monday");
               break;

           case 2:
               System.out.println("Tuesday");
               break;

           case 3:
               System.out.println("Wednesday");
               break;

           case 4:
               System.out.println("Thursday");
               break;

           case 5:
               System.out.println("Friday");
               break;

           case 6:
               System.out.println("Saturday");
               break;

           case 7:
               System.out.println("Sunday");
               break;

           default:
               System.out.println("Enter Day Between 1 to 7");

       }


//        Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.

//        int year = sc.nextInt();

//
//        Question 6:Write a program to find out the type of website from the URL:
//
//.com – commercial website
//.org – organization website
//.in – Indian website

        System.out.println("Enter Website");
        String web = sc.next();

        if(web.endsWith(".com"))
            System.out.println("This is Commercial Website");
        else if (web.endsWith(".org")) {
            System.out.println("This is Organisation Website");
        } else if (web.endsWith(".in")) {
            System.out.println("This is Indian Website");
        }
        else
            System.out.println("Please enter valid website");


    }
}


