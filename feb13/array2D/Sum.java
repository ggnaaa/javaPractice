package feb13;

public class Sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {1, 2, 4}};

        // Get the matrix elements
        int sumup = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        sumup += sum;
        System.out.println("total sum:"+sumup);

        System.out.println();
    }
    }



//int sum = 0;
//        for(int i=0; i<2; i++) {
//        for (int j = 0; j < 2; j++) {
//        System.out.print(arr[i][j] + " ");
//sum += arr[i][j];
//        }
//        System.out.println();
//        }
//                System.out.println("sum:" +sum);
//
//        }




