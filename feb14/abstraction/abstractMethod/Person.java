package feb14.abstractMethod;

abstract class Person1 {
    String name;
    int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;    }
    public abstract void displayDetails();
}
class Teacher extends Person1 {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call to the superclass constructor
        this.subject = subject;
    }
        //     @Override

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
public class Person {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Doe", 35, "Mathematics");
        teacher.displayDetails(); // Displaying the details of the teacher
    }
}