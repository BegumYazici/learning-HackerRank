package HackerRankExamples.JavaTutorial;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaDateTime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        getDate(day, month, year);
    }

    public static void getDate(int day, int month, int year) {

        Calendar takvim = new GregorianCalendar(year, month, day);
        Date tarih = takvim.getTime();

        System.out.println(tarih.toString());

        String date = (tarih.toString()).substring(0, 3);

        if (date.contains("mon")) {
            System.out.println("Monday");
        } else if (date.contains("Thu")) {
            System.out.println("Thursday");
        } else if (date.contains("Fri")) {
            System.out.println("Friday");
        } else if (date.contains("Wed")) {
            System.out.println("Wednesday");
        } else if (date.contains("Sun")) {
            System.out.println("Sunday");
        } else if (date.contains("Sat")) {
            System.out.println("Saturday");
        } else if (date.contains("Tue")) {
            System.out.println("Thuesday");
        } else System.out.println("Hata");
    }
}
