package practice;

import java.util.*;

public class tcs {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        for (int i = 1; i < 50; i++) a.add(i);
        System.out.println(a);
        for (int i : a) if (isPrime(i)) b.add(i);
        System.out.println(b);

        int q = 6, n = b.get(q - 1), sum = 0;
        System.out.println(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);

        int print = sum * b.get(q - 1);
        System.out.println(print);

        if (print >= 1 && print <= 52) {
            char ch = (char) ('A' + (print - 1) % 26);
            System.out.println("Corresponding alphabet: " + ch);
        } else {
            System.out.println("Invalid input. Please enter a number from 1 to 26.");
        }
    }
}
