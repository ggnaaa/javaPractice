package practice.notDone;

//Swap Two Numbers Without Using a Temporary Variable
public class SwapWithoutTemp {
    public static void main(String[] args) {
    int[] a={13,12,58,23,4,56,67};
    for(int i=0; i<=a.length-1; i++){
        for(int j=i+1; j<=a.length-1; j++){
            if(a[i]>a[j]){
//                int temp=a[j];
//                a[j]=a[i];
//                a[i]=temp;
//                a[i].swap(a[j]);
            }
        }
    }
        System.out.println(a[a.length-2]);
}
}
