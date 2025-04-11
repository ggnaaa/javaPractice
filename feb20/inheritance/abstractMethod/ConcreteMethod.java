package feb20.abstractMethod;
abstract class Appliance{
    public abstract void performFunction();
    void turnOn(){
        System.out.println("Appliance is on");
    }
}
class WashingMachine extends Appliance{

    @Override
    public void performFunction() {
        System.out.println("Washing clothes");
    }
}
class Refrigerator extends Appliance{

    @Override
    public void performFunction() {
        System.out.println("Cooling food");
    }
}
public class ConcreteMethod {
    public static void main(String[] args) {
        WashingMachine w=new WashingMachine();
        Refrigerator r=new Refrigerator();
        w.turnOn();
        w.performFunction();
        r.turnOn();
        r.performFunction();
    }
}
