package mar25.collection.list;

import java.util.*;
//Sort a list of custom objects using Comparable and Comparator.
class Student implements Comparable<Student> {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Natural sorting by age (Comparable)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Grade: " + grade + ")";
    }
}

public class CustomObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ana",22,76.7));
        students.add(new Student("Alice", 22, 85.5));
        students.add(new Student("Bob", 20, 90.2));
        students.add(new Student("Charlie", 25, 75.8));
        students.add(new Student("David", 23, 88.0));

        //  Sorting using Comparable (natural order by age)
        Collections.sort(students);
        System.out.println("Sorted by age (Comparable):");
        students.forEach(System.out::println);

        // Sorting using Comparator (by grade)
        Comparator<Student> gradeComparator = (s1, s2) -> Double.compare(s1.grade, s2.grade);
        Collections.sort(students, gradeComparator);
        System.out.println("\nSorted by grade (Comparator):");
        students.forEach(System.out::println);

        //  Sorting using Comparator (by name)
        Comparator<Student> nameComparator = Comparator.comparing(s -> s.name);
        Collections.sort(students, nameComparator);
        System.out.println("\nSorted by name (Comparator):");
        students.forEach(System.out::println);
    }
}
