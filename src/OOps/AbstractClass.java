package OOps;


abstract class India{
    public abstract void Morning();
    public abstract void Night();

    public void sunday(){
        System.out.println("Holiday");
        System.out.println();
    }

}
class bengal extends India{
    public void Morning(){
        System.out.println("সুপ্রভাত ");
        System.out.println();
    }
    public void Night(){
        System.out.println("শুভ রাত্রি");
        System.out.println();
    }
}

class Bihar extends India{
    public void Morning(){
        System.out.println("राम राम");
        System.out.println();
    }
    public void Night(){
        System.out.println("शुभ रात्री");
        System.out.println();
    }
}

class Punjab extends India{
    public void Morning(){
        System.out.println("ਸਤਿ ਸ਼੍ਰੀ ਅਕਾਲ");
        System.out.println();
    }
    public void Night(){
        System.out.println("ਸ਼ੁਭ ਰਾਤ");
        System.out.println();
    }
}

class MadhyaPradesh extends India{
    public void Morning(){
        System.out.println("शुभ प्रभात");
        System.out.println();
    }
    public void Night(){
        System.out.println("शुभ रात्रि");
        System.out.println();
    }
}
abstract  class HimachalPradesh extends India{
}


public class AbstractClass {
    public static void main(String[] args) {

        MadhyaPradesh ujjain = new MadhyaPradesh();
        ujjain.Morning();

        Bihar patna = new Bihar();
        patna.Night();
        patna.sunday();

        Punjab amritsar = new Punjab();
        amritsar.Night();

        bengal kolkata = new bengal();
        kolkata.Morning();
        kolkata.Night();


//        ALLOWED (DYNAMIC METHOD DISSPATCH) :-
        India Ujjain = new MadhyaPradesh();


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
