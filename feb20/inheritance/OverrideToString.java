package feb20;

import feb20.abstractMethod.ConcreteMethod;

class person3{
    String name;
    int age;

    person3(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "name: "+name+"\n"+"Age: "+age;
    }
}
class student3 extends person3{
    char grade;

    student3(String name, int age, char grade){
        super(name, age);
        this.grade=grade;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"grade:"+grade;
    }
}
public class OverrideToString {
    public static void main(String[] args) {
        student3 s=new student3("gaga",21,'B');
        System.out.println(s);
    }
}
