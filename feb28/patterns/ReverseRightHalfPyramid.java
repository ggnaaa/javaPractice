package feb28.patterns;

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        int a = 5;
        for(int i=a;i>0;i--){
            for(int j = i; j>0; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
