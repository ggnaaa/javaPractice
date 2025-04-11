package feb28.patterns;

public class KPattern {
    public static void main(String[] args) {
        int a=4;
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=a-1;i>0;i--){
            for(int j=a;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
