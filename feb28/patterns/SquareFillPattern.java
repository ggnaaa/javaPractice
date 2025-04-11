package feb28.patterns;

public class SquareFillPattern {
    public static void main(String[] args) {
        int a = 6;
        for (int i = 0; i < a; i++) { //for rows
            for (int j = 1; j <=a; j++) { //for columns
                    System.out.print("*"+"  ");
                }
            System.out.println();
            }

        }
    }

