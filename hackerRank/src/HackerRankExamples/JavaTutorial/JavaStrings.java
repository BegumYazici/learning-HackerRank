package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        int len = A.length() + B.length();
        System.out.println(len);

        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        String newWord = Character.toUpperCase(A.charAt(0)) + A.substring(1, A.length()) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1, B.length());
        System.out.println(newWord);
    }
}
