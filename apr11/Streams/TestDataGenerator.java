package apr11.streams;

import java.util.*;
import java.util.stream.Collectors;

public class TestDataGenerator {

    private static final Random rand = new Random();
    private static final String[] names = {"Alice", "Bob", "Carol", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack"};
    private static final String[] cities = {"New York", "San Francisco", "Toronto", "Mumbai", "London", "Berlin", "Tokyo", "Dubai"};
    private static final String[] states = {"NY", "CA", "ON", "MH", "LDN", "BR", "TKY", "DXB"};
    private static final String[] countries = {"USA", "Canada", "India", "UK", "Germany", "Japan", "UAE"};

    public static List<Employee> generateTestData(int count) {
        List<Department> departments = Arrays.asList(
                new Department(1, "Engineering"),
                new Department(2, "HR"),
                new Department(3, "Finance"),
                new Department(4, "Operations"),
                new Department(5, "R&D")
        );

        List<Project> allProjects = Arrays.asList(
                new Project("P100", "EHR System", true),
                new Project("P200", "Payroll App", false),
                new Project("P300", "Recruitment Portal", true),
                new Project("P400", "Inventory Tool", true),
                new Project("P500", "Security Audit", false)
        );

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            String name = names[rand.nextInt(names.length)] + i;
            double salary = 50000 + rand.nextInt(100000); // salaries between 50k and 150k
            Department dept = departments.get(rand.nextInt(departments.size()));

//           Random 1-3 projects
            List<Project> projects = rand.ints(allProjects.size(),1, 4)
                    .mapToObj(j -> allProjects.get(rand.nextInt(allProjects.size())))
                    .distinct()
                    .toList();

            // Random address
            int addrIndex = rand.nextInt(cities.length);
            Address address = new Address(cities[addrIndex], states[addrIndex % states.length], countries[addrIndex % countries.length]);

            employees.add(new Employee(1000 + i, name, salary, dept, projects, address));
        }

        return employees;
    }
}
