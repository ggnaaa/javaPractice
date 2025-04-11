package feb13;

public class SumOfColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {1, 2, 4}};


        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
                sum += arr[j][i];
            }
            System.out.println("sum of this col: " + sum);
        }
        System.out.println();

    }
}

