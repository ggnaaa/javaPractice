package feb28.patterns;

public class ButterflyStarPattern {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * (a - i)-2 ; j++) {
                System.out.print("  "); // Two spaces for each gap
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i1 = 1; i1 < a; i1++) {
            for (int j = a - 1; j > i1; j--) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * i1 ; j++) {
                System.out.print("  "); // Two spaces for each gap
            }
            for (int j = a-2; j>=i1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


