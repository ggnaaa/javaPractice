package feb14;

public class Employee {
    int id;
    String name;

    Employee(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("id: "+id+"\n"+"name:"+name);
    }

    public static void main(String[] args) {
        Employee e=new Employee(12, "avaa");
    }
}
