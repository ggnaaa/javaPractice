package feb14;

public class PrintBookDetails2 {
    String title;
    String author;
    int price;

    PrintBookDetails2(String t, String a, int y){
        this.title=t;
        this.author=a;
        this.price=y;
    }
    public void printBookDetails(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        PrintBookDetails book=new PrintBookDetails("ugly love","collen",200 );
        book.printBookDetails();
    }
}
