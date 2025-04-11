package feb14;

class vehicle3 {
    public void startEngine(){
        System.out.println("starting");
    }
}
class car1 extends vehicle3{
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("start the engine..");
//        System.out.println("This is the current Car instance: " + this);
    }
}

public class Vehicle2 {
    public static void main(String[] args) {
        car1 ca = new car1();
        ca.startEngine();
    }
}
