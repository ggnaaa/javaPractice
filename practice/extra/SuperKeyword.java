package practice.extra;//class A       //Ex‐1: call to super explicit
//{
//    public A(int i)
//    {
//        System.out.println("A class default constructor");
//    }
//}
//class B extends A {
//    public B() {
//        super(100);//Explictly we added
//        System.out.println("B class Default Constructor");
//    }
//}
//
//public class practice.extra.SuperKeyword
//{
//    public static void main(String args[])
//    {
//        B b1=new B();
//    }
//}

class A
{
public A()
{
    this(100);
    System.out.println("A class default constructor");
}
public A(int i)
{
    System.out.println("A class integer constructor");
}
}
class B extends A
{
    public B()
    {
        this(99);
        System.out.println("B class default constructor");
    }
    public B(int i)
    {
        super();//default call to super
        System.out.println("B class integer constructor");
    }
}
public class SuperKeyword
{
    public static void main(String args[])
    {
        B b1 = new B();
    }
}