package feb20.interfaceMethod;

interface Shape{
    void area();
    void perimeter();
}
class circle implements Shape{

    public void area() {
        System.out.println("area of circle: PI.r^2.");
    }

    public void perimeter() {
        System.out.println("perimeter of circle: 2pi.r");
    }
}

class Rectangle implements Shape{


    public void area() {
        System.out.println("area of rectangle: l*w");
    }


    public void perimeter() {
        System.out.println("perimeter of rectangle: 2(l+w)");
    }
}
public class AreaPerimeter {
    public static void main(String[] args) {
        circle c=new circle();
        Rectangle r=new Rectangle();
        c.area();
        c.perimeter();
        r.area();
        r.perimeter();
    }
}
