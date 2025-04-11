package feb28.patterns;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int a=4;
        int b=1;
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
    }
}
