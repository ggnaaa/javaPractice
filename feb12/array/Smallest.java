package feb12;

public class Smallest {
    public static void main(String[] args) {
        int[] a={13,12,23,4,56,67};
        int min=a[0];
        for(int i=0; i<=a.length-1; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
