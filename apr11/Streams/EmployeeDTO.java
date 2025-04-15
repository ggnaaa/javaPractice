package apr11.streams;

import java.util.List;

public class EmployeeDTO {
    private String name;
    private String deptName;
    private String city;
    private List<String> projectNames;

    public EmployeeDTO(String name, String deptName, String city, List<String> projectNames) {
        this.name = name;
        this.deptName = deptName;
        this.city = city;
        this.projectNames = projectNames;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getDeptName(){
        return deptName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", projectNames=" + projectNames +
                '}';
    }

    public String getCity(){
        return city;
    }

    public List<String> getProjectNames(){
        return projectNames;
    }
}
