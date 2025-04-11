package feb12;

public class Average {
    public static void main(String[] args) {
        int[] a={13,12,23,4,56,67};
        int sum=0;
        for(int i=0; i<=a.length-1; i++){
            sum+=a[i];
        }
        int b=sum/a.length;
        System.out.println(b);

    }
}
