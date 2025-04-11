package feb20.inheritance;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
}

class Manager extends Employee{
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize=teamSize;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Manager m=new Manager("bobby",200000,2);
        System.out.println(m.name+"\n"+m.salary+"\n"+m.teamSize);
    }
}
