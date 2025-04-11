package feb14;

public class Student {
        String name;
        int age;
        String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = "Not Assigned"; // Default grade
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }


public static void main(String[] args) {
    Student student1 = new Student("Alice", 20, "A");
    System.out.println("Student 1 Details:");
    student1.displayDetails();

    System.out.println();

    // Instantiate using the second constructor
    Student student2 = new Student("Bob", 22);
    System.out.println("Student 2 Details:");
    student2.displayDetails();
}
}

