package feb14;

public class PrintBookDetails {
    String title;
    String author;
    int yearpublished;

    PrintBookDetails(String t, String a, int y){
        this.title=t;
        this.author=a;
        this.yearpublished=y;
    }
    public void printBookDetails(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.yearpublished);
    }

    public static void main(String[] args) {
        PrintBookDetails book=new PrintBookDetails("ugly love","collen",2022);
        book.printBookDetails();
    }
}
