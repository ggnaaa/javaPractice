package feb20.inheritance;

class Animal1{
    public void sound(){
        System.out.println("pheww");
    }
}
class dog extends Animal1{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        dog d= new dog();
        d.sound();
    }
}
