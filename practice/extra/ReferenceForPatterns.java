package practice.extra;


import java.util.Scanner;

public class ReferenceForPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Loop to print the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}

