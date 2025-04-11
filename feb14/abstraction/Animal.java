package feb14;

class Animal1 {
    String name;
    String species;

    Animal1(String name, String species){
        this.name = name;
        this.species = species;
    }

    public void sound(){
        System.out.println("sound of the species: bawf bawf");
    }
}

class Dog extends Animal1 {

    Dog(String name, String species) {
        super(name, species);
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog("Bubly", "ShihTzu");
        System.out.println("name:"+d.name+"\n"+"species:"+d.species);
        d.sound();


    }
}

