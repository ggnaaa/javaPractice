package feb12;

public class Sum {
    public static void main(String[] args) {
        int[] a={13,12,23,4,56,67};
        for(int i:a){
            System.out.print(i + " ");
        }
        int sum=0;
        for(int i=0; i<=a.length-1; i++){
                sum+=a[i];
        }
        System.out.println("\n"+"sum of the above elements:"+sum);
    }
}
