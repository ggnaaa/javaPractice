package feb20.interfaceMethod;

interface Drivable{
    void drive();
}
interface Flyable{
    void fly();
}

class FlyingCar implements Flyable,Drivable{

    public void drive() {
        System.out.println("drive drive");
    }

    public void fly() {
        System.out.println("fly");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        FlyingCar fc=new FlyingCar();
        fc.drive();
        fc.fly();
    }
}
