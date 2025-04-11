package feb20.interfaceMethod;

interface Swimmer{
    void swim();
}
interface Runner{
    void run();
}

class Triathlete implements Swimmer,Runner{

    public void run() {
        System.out.println("run run");
    }

    public void swim() {
        System.out.println("swim swim");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Triathlete t = new Triathlete();
        t.run();
        t.swim();
    }
}
