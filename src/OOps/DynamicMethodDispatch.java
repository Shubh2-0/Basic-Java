package OOps;

class Mobile{
    public void on(){
        System.out.println("Mobile Method ON");
    }

    public void off(){
        System.out.println("Mobile Method OFF");
    }

}

class SmartPhone extends Mobile{
    @Override
    public void on() {
        System.out.println("SmartPhone Method ON");
    }

    public void mute(){
        System.out.println("SmartPhone is Mute Now");
    }

    @Override
    public void off() {
        System.out.println("SmartPhone Method OFF");
    }
}

class KeyPadPhone extends Mobile{
    @Override
    public void on() {
        System.out.println("KeyPad Method ON");
    }

    @Override
    public void off() {
        System.out.println("KeyPad Method OFF");
    }
}




public class DynamicMethodDispatch {
    public static void main(String[] args) {

    Mobile m1 = new Mobile();
    m1.off();
    KeyPadPhone k1 = new KeyPadPhone();
    k1.off();
    SmartPhone s1 = new SmartPhone();
    s1.off();
    s1.mute();

    Mobile s2 = new SmartPhone();
    s2.off();
    s2.on();
//    s2.Mute(); Not Allowed
//    SmartPhone s2 = new Mobile(); Not Allowed
//      KeyPadPhone k2 = mew Mobile(); Not Allowed

    }
}
