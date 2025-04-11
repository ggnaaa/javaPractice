package practice.extra;

import java.util.Comparator;
import java.util.Objects;

public class TadaComparator {
    public static void main(String[] args) {
        String a = "Alice";
        String b = "Cia";

        // Using Comparator for alphabetical order
        Comparator<String> comparator = Comparator.naturalOrder();

        // Using Objects.compare with comparator
        int result = Objects.compare(a, b, comparator);
        System.out.println("res: "+result);
    }
}

