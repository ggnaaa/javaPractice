package feb28.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a-1; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = a; i > 0; i--) {
            for (int j = a; j> i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
