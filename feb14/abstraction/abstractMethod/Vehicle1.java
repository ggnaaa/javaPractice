package feb14.abstractMethod;

abstract class vehicle {
    String make;
    String model;

    public vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

class car extends vehicle {
    int maxSpeed;

    public car(String make, String model, int maxSpeed) {
        // Call the parent class constructor
        super(make, model);
        this.maxSpeed = maxSpeed;
    }

    // Implementing the abstract method from Vehicle class
    @Override
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

public class Vehicle1 {
    public static void main(String[] args) {
        car c = new car("Toyota", "Corolla", 180);

        c.displayDetails();
    }
}

