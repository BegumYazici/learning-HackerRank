package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        boolean result =isAnagram(word1,word2);

        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int toplam1 = 0, toplam2 = 0;

        if (a.length() == b.length()) {

            String newWord1 = a.toLowerCase();
            String newWord2 = b.toLowerCase();

            char[] array1 = newWord1.toCharArray();

            for (int i = 0; i < array1.length; i++) {

                toplam1 += (int) array1[i];
            }

            char[] array2 = newWord2.toCharArray();

            for (int i = 0; i < array2.length; i++) {

                toplam2 += (int) array2[i];
            }

            if (toplam1 == toplam2) {
               // System.out.println("Anagrams");
                return true;
            } else
             //   System.out.println("Not Anagrams");
            return false;
        }
        else
          //  System.out.println("Not Anagrams");
        return false;
    }
}
