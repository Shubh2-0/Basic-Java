public class String_Problem {

    public static void main(String[] args) {

//    1.    Write a Java program to convert a string to lowercase.
        String name = "Shubham Bhati";
        name=name.toLowerCase();
        System.out.println(name);


//     2.   Write a Java program to replace spaces with underscores.
        String Assignment = "This is the Assignment in Harry JAVA Course ";
        Assignment = Assignment.replace(" ","_");
        System.out.println(Assignment);

//      3.  Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// Replace <|name|> with a string (some name)
        String letter = "Dear <|name|>, Thanks a lot";
        letter=letter.replace("<|name|>","Shubham");
        System.out.println(letter);
//
//
//
//
//      4.  Write a Java program to detect double and triple spaces in a string.
         String space = "HEllo  My name is   Shubham";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

//       5.  Write a program to format the following letter using escape sequence characters.
//                Letter = “Dear Harry, This Java Course is nice. Thanks”
        String Unknow_Method = "Dear Shubham,\n\tThis Java Course is very Helpful for you.\nThanks!";
        System.out.println(Unknow_Method);


    }

}
