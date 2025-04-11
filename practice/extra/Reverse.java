package practice.extra;
// Reverse a String Without Using the Reverse Method

public class Reverse {
    public static void main(String[] args) {
        String as = "kitkat";
        String[] splits = as.split("");
        int l = splits.length;
        for (int i = l - 1; i >= 0; i--) {
            String e = splits[i];
            System.out.print(e);
        }
        System.out.println();
    }
}
