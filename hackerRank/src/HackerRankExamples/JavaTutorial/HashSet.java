package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class HashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = scanner.next();
        }

        java.util.HashSet<String> myHashSet = new java.util.HashSet<String>();
        for (int j = 0; j < count; j++) {
            myHashSet.add(arr[j]);
            System.out.println(myHashSet.size());
        }
    }
}
