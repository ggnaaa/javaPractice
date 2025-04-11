package feb28.patterns;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        int stop=4;
        int a = 1;
        for (int i = 1; i <= stop; i++) { //for rows
            for (int j = 1; j <= i; j++) { //for columns
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        }
    }

