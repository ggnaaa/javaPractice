package feb20.interfaceMethod;

public interface Printable{
    default void print(){
        System.out.println("Printing...");
    }
}
