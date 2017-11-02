package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaHourglass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int max = -1000;

        //fill in the array with elements
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + (arr[i + 1][j + 1]) + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}

