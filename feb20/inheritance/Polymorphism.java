package feb20;

import feb20.abstractMethod.ConcreteMethod;

class Person{
    public void introduce(){
        System.out.println("introduce===");
    }
}

class Student extends Person{
    @Override
    public void introduce(){
        System.out.println("student introduce");
    }
}

class Teacher extends Person{
    @Override
    public void introduce(){
        System.out.println("teacher introduce");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student st=new Student();
        Teacher t=new Teacher();
        st.introduce();
        t.introduce();
    }
}
