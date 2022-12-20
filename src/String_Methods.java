import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");

        String name = sc.nextLine();

        int length = name.length();
        System.out.println("Total Characters is "+length+" With Space");

        String l = name.toLowerCase();
        System.out.println("Lower Case : "+l);

        String u = name.toUpperCase();
        System.out.println("Upper Case : "+u);

        String sub = name.substring(3);
        System.out.println("name is begin here from 3 is "+ sub);

        String sub2 = name.substring(2,5);
        System.out.println("name Starts from 3 and end with 3 index "+sub2);

        String m = name.replace("s","b");
        System.out.println("After Changing first letter "+ m);

        String f = name.replace("shubh","shi");
        System.out.println(f);

        boolean start = name.startsWith("he");
        System.out.println(start);

        boolean end = name.endsWith("th");
        System.out.println(end);

        char position = name.charAt(3);
        System.out.println("The position of 4 character is "+position);

        int index = name.indexOf('s');
        index++;
        System.out.println("The position of first 's' is "+index);

        int index1 = name.lastIndexOf('b');
        index1++;
        System.out.println("The last position of 'b' is "+ index1);

        boolean equal = name.equals("shubham bhati");
        System.out.println(equal);

        boolean equalIgnoreCase = name.equalsIgnoreCase("Shubham BHATI");
        System.out.println(equalIgnoreCase);

        char pn = name.charAt(3);
         System.out.println(pn);

        System.out.println("shubham \\ bhati");
        System.out.println("shubham \" bhati");
        System.out.println("shubham \t bhati");
        System.out.println("shubham \n bhati");





    }
}
