package feb13;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;

//        System.out.println(Arrays.deepToString(arr));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

