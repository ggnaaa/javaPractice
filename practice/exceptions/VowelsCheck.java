package practice.exceptions;

public class VowelsCheck {
    public static void main(String[] args) {
        String a = "sdfga";
        checkv(a);
    }

    public static boolean checkv(String a) {
        String b = a.toLowerCase();
        int c = b.length();
        System.out.println(a);
        try {
            for (int i = 0; i < c; i++) {
                if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') {
                    throw new VowelsException("the string "+a+" contains vowel");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

