package feb10.strings;

import java.util.Scanner;

public class Repeat {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the input: ");
        String sentence =s.nextLine();

        System.out.println(firstNonRepeatingWord(sentence));
    }

    public static String firstNonRepeatingWord(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].equals(words[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return words[i];
            }
        }
        return null; 
    }
}

