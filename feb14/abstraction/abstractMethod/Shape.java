package feb14.abstractMethod;

abstract class Shape1 {
    public abstract void draw();
}

class Circle extends Shape1 {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}

class Square extends Shape1 {
    @Override
    public void draw() {
        System.out.println("square");
    }
}

public class Shape {  // Practice.Main class is named "Shape"
    public static void main(String[] args) {
        Shape1 circle = new Circle();
        Shape1 square = new Square();

        circle.draw();
        square.draw();
    }
}
