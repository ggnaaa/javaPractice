package feb28.patterns;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = a-2; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
