package feb28.patterns;

public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        int a=4;
        int b=1;
        int c=2;
        for (int i = a; i > 0; i--) {
            for (int j = a; j> i; j--) {
                System.out.print(" ");
            }
            for (int k =b;k<=a;k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            b++;
        }
        for(int i=a-1; i>=1; i--){
            for(int j=a; j>c; j--){
                System.out.print(" ");
            }
            for(int j=i;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            c++;
        }

    }
}
