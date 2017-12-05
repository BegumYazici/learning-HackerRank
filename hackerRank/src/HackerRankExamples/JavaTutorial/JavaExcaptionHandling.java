package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaExcaptionHandling {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int p = scan.nextInt();
            if (n < 0 || p < 0) {
                hataFirlatir2();
            } else if (n == 0 || p == 0) {
                hataFirlatir();
            } else {
                System.out.println((int)Math.pow(n, p));
            }
        } catch (ExceptionZero e) {
            System.out.println(e.getMessage());
        } catch (ExceptionNegative en) {
            System.out.println(en.getMessage());
        }
    }

    public static void hataFirlatir() throws ExceptionZero {
        throw new ExceptionZero();
    }

    public static void hataFirlatir2() throws ExceptionNegative {
        throw new ExceptionNegative();
    }
}

class ExceptionZero extends Exception {

    @Override
    public String getMessage() {
        return "n and p should not be zero.";
    }
}

class ExceptionNegative extends Exception {

    @Override
    public String getMessage() {
        return "n or p should not be negative.";
    }
}

