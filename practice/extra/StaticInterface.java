package practice.extra;

public class StaticInterface {
    static void clf(){
        System.out.println("hehe");
    }

    public static void main(String[] args) {
//        Practice.static_interface st=new Practice.static_interface();
        clf();  // same as below one
        StaticInterface.clf();
    }
}
