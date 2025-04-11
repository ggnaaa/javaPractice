package practice.extra;

public class Palindrome {
    public static void main(String[] args) {
        String a="hii";
        boolean res= palindrome(a);
        System.out.println(res);

    }

    public static boolean palindrome(String a){
        int left = 0;
        int right=a.length()-1;

        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
