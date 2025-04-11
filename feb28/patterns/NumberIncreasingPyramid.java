package feb28.patterns;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i < a; i++) { //for rows
            for (int j = 1; j < a; j++) { //for columns
                if (i>=j) {
                    System.out.print(" "+j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
