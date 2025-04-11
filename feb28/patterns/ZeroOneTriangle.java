package feb28.patterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a; i++) { //for rows
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

