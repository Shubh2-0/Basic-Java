package OOps;

class Memory{

    String str;
    int age;

    public Memory(String str, int age) {
        this.str = str;
        this.age = age;
    }
}


public class HowMemoryWork {

    public static void main(String[] args) {
        Memory m1 = new Memory("Memory1",20);
        int power = (int) Math.pow(2,2);
        System.out.println(power);

        System.out.println(m1);
//          second time run = OOps.Memory@6d03e736
//        first time run = OOps.Memory@6d03e736
//        third time run = OOps.Memory@6d03e736

    }




}
