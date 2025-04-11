package feb20.inheritance;
import java.util.*;
class Calculator{
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st input: ");
        int a=sc.nextInt();
        System.out.print("enter the 2nd input: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
    }
}

class AdvancedCalculator extends Calculator{
    @Override
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st input: ");
        double a=sc.nextDouble();
        System.out.print("enter the 2nd input: ");
        double b=sc.nextDouble();
        double c=a+b;
        System.out.println(c);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        AdvancedCalculator ad=new AdvancedCalculator();
//        c.add();
        ad.add();
    }
}
