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

        System.out.println(m1);

//        first time run = OOps.Memory@6d03e736

    }




}
