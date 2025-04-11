package practice.constuctors;
//Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
//Implement a private constructor and a public static method to get the single instance of the class.
// Print a message indicating the creation of the instance.

class Singleton{
    private static Singleton bc;

    private Singleton(){
        System.out.println("hey babygirl, the instance has been created..");
    }

    public static Singleton getBc() {
        if (bc == null) {
            bc = new Singleton();
        }
        return bc;
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getBc();
        Singleton obj2 = Singleton.getBc();
        System.out.println("Are both instances the same? " + (obj1 == obj2));  // Output: true
    }
}
