package feb14.abstractMethod;

abstract class emp{
    public abstract double calculateSalary();

    public abstract String getJobTitle();
}

class manager extends emp{
    public double calculateSalary() {
        return 50000*12;
    }

    public String getJobTitle() {
        return "Manager";
    }
}

class developer extends emp{
    @Override
    public double calculateSalary() {
        return 40000*12;
    }

    @Override
    public String getJobTitle() {
        return "Developer";
    }
}
public class Employee1 {
    public static void main(String[] args) {
        emp manager = new manager();
        emp developer = new developer();
        System.out.println(manager.getJobTitle() + ": " + manager.calculateSalary());
        System.out.println(developer.getJobTitle() + ": " + developer.calculateSalary());
    }
}
