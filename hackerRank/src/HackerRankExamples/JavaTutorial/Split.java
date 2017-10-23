package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class Split {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word=scan.nextLine();
        scan.close();

        String [] words=word.split("[^\\p{Alpha}]+");

        System.out.println(word.isEmpty() ? 0 : words.length);

        for(String s: words){
            System.out.println(s);
        }
    }
}
