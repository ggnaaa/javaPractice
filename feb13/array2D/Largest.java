package feb13;

public class Largest {
    public static void main(String[] args) {
        int[][] a = {{1, 7, 2}, {2, 3, 2}, {1, 2, 4}};
//                System.out.print(a[i][j] + " ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}
//                    System.out.println(Arrays.deepToString(a));
//                }
//            }
//        }
//        int large=0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++){
//                System.out.print(a[i][j] + " ");
//                if (a[j][j] <= a[j + 1][j + 1]) {
//                    System.out.println("largest: "+a[j][j]);
//                }
//                System.out.println();
//        }
//
//        }
//        System.out.println("largest element in the array is: "+a[a.length-1][a.length-1]);

