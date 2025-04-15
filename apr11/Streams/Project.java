package apr11.streams;

public class Project {
    private String code;
    private String name;
    private boolean isActive;

    @Override
    public String toString() {
        return "Project{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public Project(String code, String name, boolean isActive) {
        this.code = code;
        this.name = name;
        this.isActive = isActive;
    }

    // getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }
}
