package feb20.interfaceMethod;

class Document implements feb20.interfaceMethod.Printable {

    @java.lang.Override
    public void print() {
        System.out.println("Document is printing...");
    }
}
public class Override {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
    }
}
