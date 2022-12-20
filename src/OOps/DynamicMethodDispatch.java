package OOps;

class Mobile{
    public void On(){
        System.out.println("Mobile Method ON");
    }

    public void Off(){
        System.out.println("Mobile Method OFF");
    }

}

class SmartPhone extends Mobile{
    @Override
    public void On() {
        System.out.println("SmartPhone Method ON");
    }

    public void Mute(){
        System.out.println("SmartPhone is Mute Now");
    }

    @Override
    public void Off() {
        System.out.println("SmartPhone Method OFF");
    }
}

class KeyPadPhone extends Mobile{
    @Override
    public void On() {
        System.out.println("KeyPad Method ON");
    }

    @Override
    public void Off() {
        System.out.println("KeyPad Method OFF");
    }
}




public class DynamicMethodDispatch {
    public static void main(String[] args) {

    Mobile m1 = new Mobile();
    m1.Off();
    KeyPadPhone k1 = new KeyPadPhone();
    k1.Off();
    SmartPhone s1 = new SmartPhone();
    s1.Off();
    s1.Mute();

    Mobile s2 = new SmartPhone();
    s2.Off();
    s2.On();
//    s2.Mute(); Not Allowed
//    SmartPhone s2 = new Mobile(); Not Allowed
//      KeyPadPhone k2 = mew Mobile(); Not Allowed

    }
}
