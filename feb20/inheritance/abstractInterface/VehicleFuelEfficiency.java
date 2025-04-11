package feb20.abstractInterface;

abstract class vehicle{
    public abstract void move();
}
interface FuelEfficiency{
    void getFuelEfficiency();
}

class car extends vehicle implements FuelEfficiency{

    @Override
    public void getFuelEfficiency() {
        System.out.println("car fuel is full");

    }

    @Override
    public void move() {
        System.out.println("car is moving");
    }
}

class bike extends vehicle implements FuelEfficiency{

    public void getFuelEfficiency() {
        System.out.println("bike fuel is half");
    }

    @Override
    public void move() {
        System.out.println("bike is moving");
    }
}


public class VehicleFuelEfficiency {
    public static void main(String[] args) {
        bike b=new bike();
        car c=new car();
        b.move();
        b.getFuelEfficiency();
        c.move();
        c.getFuelEfficiency();
    }
}
