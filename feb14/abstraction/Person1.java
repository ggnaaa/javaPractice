package feb14;

class person{
    String name;
    int age;

    person(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class student1 extends person{
    char grade;

    student1(String name, int age, char grade){
        super(name, age);
        this.grade=grade;
    }
}
public class Person1 {
    public static void main(String[] args) {
        student1 s=new student1("cia",21,'A');
        System.out.println("name: "+s.name+"\n"+"age: "+s.age+"\n"+"Grade: "+s.grade);
    }
}
