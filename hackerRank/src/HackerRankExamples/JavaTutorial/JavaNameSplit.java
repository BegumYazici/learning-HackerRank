package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaNameSplit {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("İsmi girin: ");
        String isim = giris.nextLine();

        String[] dizim = isim.split(" ");

        for (int i = 0; i < dizim.length; i++) {
            System.out.println(dizim[i]);
        }
        for (int i = 0; i < dizim.length; i++) {
            System.out.println(dizim[i].charAt(0));
        }
    }
}

