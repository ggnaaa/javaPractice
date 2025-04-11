package feb28.patterns;

public class NumberTriangular {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

