package practice.constuctors;

public class Constructor {
    int i;

    // default Practice.contructor
    Constructor(){
        System.out.println("hello");
    }

    // parameterized Practice.contructor
    Constructor(int i){
        this.i=17;
//        int a=i+this.i;
//        System.out.println(a);
    }
    // copy Practice.contructor
    Constructor(Constructor a){
        this.i=a.i;

    }
    public static void main(String[] args) {
        Constructor hi=new Constructor();
        Constructor c=new Constructor(2);
        System.out.println(c.i);
        Constructor c1=new Constructor(c);
        System.out.println(c1.i);
    }
}
