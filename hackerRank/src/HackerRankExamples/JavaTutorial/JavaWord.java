package HackerRankExamples.JavaTutorial;

public class JavaWord {
    public static void main(String[] args) {

        String metin = "Kullanicidan A'dan Z'ye kadar bir harf girmesini isteyin ve girilen harflere kadar olan harflerden olusan bir piramit seklinde cikti olusturun." +
                " Piramitteki üst harf A olmalı ve her seviyede alfabedeki bir sonraki harf, ustteki seviyede tanitilan harfin iki kopyasına kadar dusmelidir.";

        String[] dizim2=metin.split(" ");

        for(String j : dizim2)
            System.out.println(j);

        System.out.println("Metindeki kelime sayim: "+dizim2.length);
    }
}
