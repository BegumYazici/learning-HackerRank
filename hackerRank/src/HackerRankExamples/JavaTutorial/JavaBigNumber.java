package HackerRankExamples.JavaTutorial;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a =scan.nextLine();
        String b =scan.nextLine();
        scan.close();

        System.out.println(new BigInteger(a).add(new BigInteger(b)));
        System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
    }
}
