package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaFirstLetter {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 5) {
            System.out.print("Isim giriniz:");
            String isim = giris.next();
            sb.append(isim);
            sb.append(" ");
            i++;
        }

        String isimler = sb.toString();
        String[] dizi = isimler.split(" ");

        for (int j = 0; j < dizi.length; j++) {
            System.out.print(dizi[j].charAt(0));
        }
    }
}

