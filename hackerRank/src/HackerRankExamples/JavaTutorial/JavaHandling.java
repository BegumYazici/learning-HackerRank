package HackerRankExamples.JavaTutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaHandling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
        }catch(ArithmeticException e1){
            System.out.println(e1);
        }
    }
}
