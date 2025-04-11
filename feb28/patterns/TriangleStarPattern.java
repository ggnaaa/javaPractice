package feb28.patterns;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int a=5;
        for (int i = 1; i <= a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
