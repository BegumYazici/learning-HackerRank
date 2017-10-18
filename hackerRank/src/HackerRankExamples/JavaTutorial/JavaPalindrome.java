package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        char[] array=A.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int j=array.length-1; j>=0; j--){

            sb.append(array[j]);
        }

        if(A.equals(sb.toString())){

            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
