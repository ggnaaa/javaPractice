package feb12;

public class    Max {
    public static void main(String[] args) {
        int[] a={13,12,23,4,56,67};
        int max=a[0];
        for(int i=0; i<=a.length-1; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
