package practice.constuctors;
//Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
// Implement a default constructor and a parameterized constructor that takes all three instance variables.
// Use constructor chaining to initialize the variables. Print the values of the variables.

class Student{
    String studentID;
    String studentName;
    char grade;

    Student(){
        this.studentID="1";
        this.studentName="ana";
        this.grade='A';
        System.out.println("id:"+studentID+", "+"name:"+studentName+", "+"grade:"+grade);
    }

    Student(String id, String name, char grade){
        this.studentID=id;
        this.studentName=name;
        this.grade=grade;
        System.out.println("id:"+id+", "+"name:"+name+", "+"grade:"+grade);
    }
}
public class Chaining {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("2","cia",'B');
    }
}
