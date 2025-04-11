package practice.notDone;
//Print a Rectangle or Square Pattern Without Using Nested Loops
public class PatternWithoutNestedLoop {
    public static void main(String[] args) {
        int a = 4;
//        for (int i = 0; i < a; i++) {
//            System.out.print(i + " ");
//        }
        int i=0;
        while(i<a){
        for (int j = 0; j < a; j++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println(i);
        }
//        for (i = 0; i <= a; i++) {
//            System.out.print(i + " ");
//        }
    }
}
