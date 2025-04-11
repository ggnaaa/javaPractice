package feb28.patterns;

public class SquareHollowPattern {
    public static void main(String[] args) {
        int a = 6;
        for (int i = 0; i < a; i++) { //for rows
            for (int j = 0; j < a; j++) { //for columns
                if (i == 0 || j == 0 || i==a-1 ||j == a - 1) { // to print square
                    System.out.print("*"+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
