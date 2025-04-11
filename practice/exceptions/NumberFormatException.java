package practice.exceptions;

public class NumberFormatException {
    public static void main(String[] args) {
        String a="mana";
        try{
            Integer b=Integer.parseInt(a);
            System.out.println("the value is int");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("the value is not int");
        }
    }
}
