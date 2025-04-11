package feb13;

public class SumOfRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {1, 2, 4}};


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println("sum of this row: " + sum);
        }
            System.out.println();

    }
}
