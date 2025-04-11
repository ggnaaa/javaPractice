package practice.exceptions;

public class Vowels {
    public static void main(String[] args) throws VowelsException {
        String a="mbbs";
        String[] b = a.split("");
        char[] v = {'a', 'e', 'i', 'o', 'u'};      // Vowels to check
        try {
            for (String s : b) {
                if (checkvowel(s, v)) {
                    throw new VowelsException("String contains vowels: " + s);
                }
            }
        } catch (VowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check if a string contains any vowels
    public static boolean checkvowel(String str, char[] v) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < v.length; j++) {
                char vowel = v[j];
                if (ch == vowel) {
                    return true;
                }
            }
        }
        return false;
    }
}




























































































          // enhanced for loop
//            for (char vowel : vowels) {
//                if (ch == vowel) {
//                    return true;
//                }
//            }
