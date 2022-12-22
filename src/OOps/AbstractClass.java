package OOps;


abstract class India{
    public abstract void morning();
    public abstract void night();

    public void sunday(){
        System.out.println("Holiday");
        System.out.println();
    }

}
class bengal extends India{
    public void morning(){
        System.out.println("সুপ্রভাত ");
        System.out.println();
    }
    public void night(){
        System.out.println("শুভ রাত্রি");
        System.out.println();
    }
}

class Bihar extends India{
    public void morning(){
        System.out.println("राम राम");
        System.out.println();
    }
    public void night(){
        System.out.println("शुभ रात्री");
        System.out.println();
    }
}

class Punjab extends India{
    public void morning(){
        System.out.println("ਸਤਿ ਸ਼੍ਰੀ ਅਕਾਲ");
        System.out.println();
    }
    public void night(){
        System.out.println("ਸ਼ੁਭ ਰਾਤ");
        System.out.println();
    }
}

class MadhyaPradesh extends India{
    public void morning(){
        System.out.println("शुभ प्रभात");
        System.out.println();
    }
    public void night(){
        System.out.println("शुभ रात्रि");
        System.out.println();
    }
}
abstract  class HimachalPradesh extends India{
}


public class AbstractClass {
    public static void main(String[] args) {

        MadhyaPradesh ujjain = new MadhyaPradesh();
        ujjain.morning();

        MadhyaPradesh indore = new MadhyaPradesh();

     /*   System.out.println(ujjain);
        System.out.println(indore);*/

        Bihar patna = new Bihar();
        patna.night();
        patna.sunday();

        Punjab amritsar = new Punjab();
        amritsar.night();

        bengal kolkata = new bengal();
        kolkata.morning();
        kolkata.night();

//        System.out.println(kolkata);
//        System.out.println(patna);
//        System.out.println(indore);
//     ADDRESS OF KOLKATA OBJECT IN RAM :- OOps.bengal@2d98a335

//        ALLOWED (DYNAMIC METHOD DISSPATCH) :-



//        HimachalPradesh city = new HimachalPradesh()   NOT ALLOWED


//        HimachalPradesh city = new HimachalPradesh() {   ALOOWED
//            @Override
//            public void Morning() {
//                System.out.println("good morning");
//            }
//
//            @Override
//            public void Night() {
//                System.out.println("good night");
//            }
//        };

    }

}
