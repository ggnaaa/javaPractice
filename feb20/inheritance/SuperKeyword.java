package feb20;

import feb20.abstractMethod.ConcreteMethod;

class Parent{
    public void display(){
        System.out.println("hehehe");
    }
}

class child extends Parent{
    @Override
    public void display() {
        super.display();
        System.out.println("hahaha");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
}
