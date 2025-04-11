package feb20.interfaceMethod;

interface Movable{
    abstract void move();
}
class car3 implements Movable{

    public void move() {
        System.out.println("movee it");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        car3 c=new car3();
        c.move();
    }
}
