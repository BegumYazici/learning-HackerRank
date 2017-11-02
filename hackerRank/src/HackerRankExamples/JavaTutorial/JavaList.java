package HackerRankExamples.JavaTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int bufferSize = scan.nextInt();

        for (int i = 0; i < bufferSize; i++) {

            list.add(scan.nextInt());
        }

        int methodCount = scan.nextInt();

        for (int i = 0; i < methodCount; i++) {

            String methodName = scan.next(); //insert or delete
            if (methodName.contains("Insert")) {
                int indexAdd = scan.nextInt();
                int valueAdd = scan.nextInt();

                list.add(indexAdd, valueAdd);
            } else if (methodName.contains("Delete")) {
                int indexDelete = scan.nextInt();
                list.remove(indexDelete);
            }
        }

        for (Integer itr : list) {
            System.out.print(itr + " ");
        }
        System.out.println();
    }
}
