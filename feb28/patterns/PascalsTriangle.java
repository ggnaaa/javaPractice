package feb28.patterns;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("   1");
        int a = 4;
        for(int i=1;i<a;i++){
            for(int j=i+1;j<a;j++){
                System.out.print(" ");
            }
            int q=1;
            for(int j=0;j<=i;j++){
                System.out.print(q+" ");
                q=q*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
