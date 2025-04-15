package apr11.streams;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private List<Project> projects;
    private Address address;

    public Employee(int id, String name, double salary, Department department, List<Project> projects, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.projects = projects;
        this.address = address;
    }


    // getters (add if using in streams or unit test)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", projects=" + projects +
                ", address=" + address +
                '}';
    }
}
