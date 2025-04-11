package feb14.interfaceMethod;

// Corrected interface name (should be Movable, not movable)
interface Movable1 {
    void moveLeft();
    void moveRight();
}

class Vehicle {
    void moveLeft() {
        System.out.println("hehe left");
    }

    void moveRight() {
        System.out.println("haha right");
    }
}

class Car extends Vehicle implements Movable1 {
    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println("Car moving left");
    }

    @Override
    public void moveRight() {
        super.moveRight();
        System.out.println("Car moving right");
    }
}

class Bicycle extends Vehicle implements Movable1 {
    @Override
    public void moveLeft() {
        super.moveLeft();
        System.out.println("Bicycle moving left");
    }

    @Override
    public void moveRight() {
        super.moveRight();
        System.out.println("Bicycle moving right");
    }
}

public class Movable {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();

        System.out.println();
        c.moveLeft();
        c.moveRight();


        System.out.println();
        b.moveLeft();
        b.moveRight();
    }
}
