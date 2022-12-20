package OOps;

public class Employee {

    String name;
    int Age;
    int Salary;
    String id;
    int experience;

   Employee(String name,int Age, int Salary, String id,int experience){
   this.name=name;
   this.Age=Age;
   this.Salary=Salary;
   this.id=id;
   this.experience=experience;
   }

   void increment(){
       if(this.experience>5){
           System.out.println(this.name + " Congratulations! Next Month you will get salary increment");
       }else if(experience > 4 && experience < 3 ){
           System.out.println(this.name + " Wait for 1 Years");
       }else{
           System.out.println(this.name + " Work Hard and Again some experience");
       }
   }

   void bonus(){
       if(Age>20){
           System.out.println(this.name + " Congratulations!, You are eligible for Bonus ");
       }
       else if(Age > 30){
           System.out.println(this.name + " WOW! Mega Reward");
       }
       else{
           System.out.println(this.name + " Wait for bonus");
       }
   }


   void  tax(){
   if(Salary >= 50000){
       System.out.println("30% of salary");
   }else if(Salary < 50000 && Salary >= 30000){
       System.out.println("20% of salary");
   }else if(Salary < 30000 && Salary >= 25000){
       System.out.println("10% of salary");
   }else{
       System.out.println("Not Eligible of Paying Tax");
   }
   }


}
