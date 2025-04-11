package feb28.patterns;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        int a=5;
        for (int i = 1; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
                System.out.println(); // Move to the next line
        }
        for(int i=0; i<a; i++){
            System.out.print("*"+" ");
        }
    }
}

