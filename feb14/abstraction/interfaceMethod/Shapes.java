package feb14.interfaceMethod;

interface shape {
    void draw();
    void erase();
}

interface ColoredShape extends shape {
    void setColor(String color);
}

class circ implements ColoredShape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
    public void erase() {
        System.out.println("Erasing the Circle.");
    }

    public void setColor(String color) {
        System.out.println("Setting the Circle color to " + color);
    }
}
public class Shapes {
    public static void main(String[] args) {
        circ c = new circ();
        c.draw();
        c.setColor("blue");
        c.erase();
    }
}
