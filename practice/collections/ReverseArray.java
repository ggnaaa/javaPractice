package practice.collections;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
//        for(int i=a.length-1;i>=0;i--){
//            System.out.print(a[i]+" ");
//        }
        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print("*" + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+" "+" "+" ");
            }
            for (int j = a; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
