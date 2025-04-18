package apr11.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //write code here
        List<Employee> employees = TestDataGenerator.generateTestData(200);  // You can generate 200, 500, or more

        //1  Filtering
        //1.1 Filter by Department and Salary
//        List<Employee> highpay = getHighPaidEngineers(employees);
//        for (Employee e : highpay) {
//            System.out.println("name: " + e.getName() + ", " + "id: " + e.getId() + ", " + "department: " + e.getDepartment().getName() + ", " + "salary: " + e.getSalary());
//        }

        //1.2 Employees in a Given Country
//        List<Employee> result = CountryIndia(employees);
//        for (Employee e : result) {
//            System.out.println(e.toString());
//        }

        //1.3 Employees Working on a Specific Project
//        printEHRProjects(employees);

        //4  Mapping and DTO Conversion
        //4.1 Convert to DTO
//        List<EmployeeDTO> dtos = convertToDTO(employees);
//        for (EmployeeDTO dto : dtos) {
//            System.out.println(dto);
//        }

        //4.2 List of All Employee Names
//        EmpNames(employees);

        //4.3 Flatten All Project Names
//        Set<String> proj = flatten(employees);

//        for (String pro : proj) {
//            System.out.println(pro);
//        }

        //7 Grouping and Aggregation
        //7.1 Group Employees by Department
//        Map<Object, List<Employee>> groupedByDept = department(employees);
//        for (Map.Entry<Object, List<Employee>> entry : groupedByDept.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }

        //7.2 Count Employees by Country
//        Map<Object, Long> coun = CountryCount(employees);
//        for (Map.Entry<Object, Long> entry : coun.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }

        //7.3 Average Salary by Department
//        Map<String, Double> groupedByDept = AvgSalary(employees);
//        for (Map.Entry<String, Double> entry : groupedByDept.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }

        //7.4 Employees per Project
//        Map<String, List<Employee>> groupedByDept = employeesPerProject(employees);
//        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }

        //🔹 Advanced Filters and Combinations
        //11 Employees with Multiple Projects
//        moreprojects(employees);

        //12 Top 3 Highest Paid Employees
//        List<Employee> dtos = highpay(employees);
//        for (Employee dto : dtos) {
//            System.out.println(dto);
//        }

        //13 Highest Paid Employee per Department
//        highestSalaryInDepartment(employees);

        //14 Employee Count per Department, Sorted Descending
//        Empcount(employees);

        //15 Find Duplicate Project Assignments
//        ProjDuplicates(employees);

        //🔹 Combining Address & Department
        //16 Group by Country then Department
    }

    public static List<Employee> getHighPaidEngineers(List<Employee> employees) {
        List<Employee> highPaidEngineers = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getDepartment().getName().equals("Engineering") && e.getSalary() > 100000) {
                highPaidEngineers.add(e);
            }
        }
        return highPaidEngineers;
    }

    public static List<Employee> CountryIndia(List<Employee> employees) {
        List<Employee> a = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getAddress().getCountry().equals("India")) {
                a.add(e);
            }
        }
        return a;
    }

    public static void printEHRProjects(List<Employee> employees) {
        for (Employee e : employees) {
            for (Project p : e.getProjects()) {
                if ("EHR System".equals(p.getName())) {
                    System.out.println("name:" + e.getName() +
                            ", id:" + e.getId() +
                            ", department:" + e.getDepartment().getName() +
                            ", project:" + p.getName());
                }
            }
        }
    }

    public static List<EmployeeDTO> convertToDTO(List<Employee> employees) {
        List<EmployeeDTO> dtos = new ArrayList<>();

        for (Employee e : employees) {
            // Employee details
            String name = e.getName();
            String departmentName = e.getDepartment() != null ? e.getDepartment().getName() : "Unknown";
            String city = e.getAddress() != null ? e.getAddress().getCity() : "Unknown";

            // Collect project names (only once for each employee)
            List<String> projectNames = e.getProjects()
                    .stream()
                    .map(Project::getName)
                    .distinct()  // Ensure unique project names (in case of duplicates)
                    .collect(Collectors.toList());

            // Create EmployeeDTO with the details
            EmployeeDTO dto = new EmployeeDTO(name, departmentName, city, projectNames);
            dtos.add(dto);
        }
        return dtos;
    }

    public static void EmpNames(List<Employee> emp) {
        for (Employee e : emp) {
            System.out.print(e.getName() + ", ");
        }
        System.out.println();
    }

    public static Set<String> flatten(List<Employee> emp) {
        Set<String> a = new HashSet<>();
        for (Employee e : emp) {
            for (Project p : e.getProjects()) {
                a.add(p.getName());
            }
        }
        return a;
    }

    public static Map<Object, List<Employee>> department(List<Employee> emp) {
        Map<Object, List<Employee>> a = new HashMap<>();
        for (Employee e : emp) {
            String deptName = e.getDepartment().getName();
            a.computeIfAbsent(deptName, k -> new ArrayList<>()).add(e);
        }
        return a;
    }

    public static Map<Object, Long> CountryCount(List<Employee> emp) {
        Map<Object, Long> a = new HashMap<>();
        for (Employee e : emp) {
            String coun = e.getAddress().getCountry();
            a.put(coun, a.getOrDefault(coun, 0L) + 1);
        }
        return a;
    }

    public static Map<String, Double> AvgSalary(List<Employee> emp) {
        Map<String, Double> totalSalary = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (Employee e : emp) {
            String dept = e.getDepartment().getName();
            totalSalary.put(dept, totalSalary.getOrDefault(dept, 0.0) + e.getSalary());
            count.put(dept, count.getOrDefault(dept, 0) + 1);
        }

        Map<String, Double> avgSalary = new HashMap<>();
        for (String dept : totalSalary.keySet()) {
            avgSalary.put(dept, totalSalary.get(dept) / count.get(dept));
        }
        return avgSalary;
    }

    public static Map<String, List<Employee>> employeesPerProject(List<Employee> employees) {
        Map<String, List<Employee>> employeesByProject = new HashMap<>();
        for (Employee e : employees) {
            for (Project p : e.getProjects()) {
                if (!employeesByProject.containsKey(p.getName())) {
                    employeesByProject.put(p.getName(), new ArrayList<>());
                }
                employeesByProject.get(p.getName()).add(e);
            }
        }
        return employeesByProject;
    }

    public static void moreprojects(List<Employee> emp) {
        for (Employee e : emp) {
            int projectCount = e.getProjects().size(); // count of projects

            if (projectCount > 2) {
                System.out.println("Employee Name: " + e.getName() + ", Employee ID: " + e.getId() + ", Department: " + e.getDepartment().getName() + ", Number of Projects: " + projectCount);
            }
        }
    }

    public static List<Employee> highpay(List<Employee> emp) {
        List<Employee> sortedEmployees = new ArrayList<>(emp);
        sortedEmployees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        // Get the top 3 highest paid employees
        List<Employee> top3 = new ArrayList<>();
        for (int i = 0; i < 3 && i < sortedEmployees.size(); i++) {
            top3.add(sortedEmployees.get(i));
        }
        return top3;
    }

    public static void highestSalaryInDepartment(List<Employee> emp) {
        Map<String, List<Employee>> deptTopEarnersMap = new HashMap<>();
        for (Employee e : emp) {
            String deptName = e.getDepartment().getName();
            double salary = e.getSalary();
            deptTopEarnersMap.putIfAbsent(deptName, new ArrayList<>());
            List<Employee> deptEmployees = deptTopEarnersMap.get(deptName);
            if (deptEmployees.isEmpty()) {
                deptEmployees.add(e);
            } else {
                // Find the current top salary in the department
                double maxDeptSalary = deptEmployees.get(0).getSalary();
                if (salary > maxDeptSalary) {
                    // New highest salary for the department, replace the list
                    deptEmployees.clear();
                    deptEmployees.add(e);
                } else if (salary == maxDeptSalary) {
                    // If salary is equal to the max, add this employee to the list
                    deptEmployees.add(e);
                }
            }
        }
        System.out.println("Departments");
        for (Map.Entry<String, List<Employee>> entry : deptTopEarnersMap.entrySet()) {
            String deptName = entry.getKey();
            List<Employee> topEarners = entry.getValue();

            for (Employee e : topEarners) {
                System.out.println(deptName+" ->"+"  Name: " + e.getName()+"  ID: " + e.getId()+"  Salary: " + e.getSalary());
            }
        }
    }

    public static void Empcount(List<Employee> emp){
        Map<String, Integer> deptEmployeeCount = new HashMap<>();

        for (Employee e : emp) {
            String deptName = e.getDepartment().getName();
            deptEmployeeCount.put(deptName, deptEmployeeCount.getOrDefault(deptName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedDeptCounts = new ArrayList<>(deptEmployeeCount.entrySet());
        sortedDeptCounts.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Employee Count per Department (Descending):");
        for (Map.Entry<String, Integer> entry : sortedDeptCounts) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void ProjDuplicates(List<Employee> emp){
        Map<String, List<Employee>> projectToEmployees = new HashMap<>();

        for (Employee e : emp) {
            for (Project p : e.getProjects()) {
                String projectId = p.getName();

                projectToEmployees.putIfAbsent(projectId, new ArrayList<>());
                projectToEmployees.get(projectId).add(e);
            }
        }

        System.out.println("Duplicate Project Assignments:");
        for (Map.Entry<String, List<Employee>> entry : projectToEmployees.entrySet()) {
            List<Employee> assignedEmployees = entry.getValue();
            if (assignedEmployees.size() > 1) {
                System.out.println("Project ID: " + entry.getKey() + " is assigned to:");

                for (Employee e : assignedEmployees) {
                    System.out.println("  - " + e.getName() + " (ID: " + e.getId() + ")");
                }
                System.out.println("------------------------");
            }
        }
    }
}




