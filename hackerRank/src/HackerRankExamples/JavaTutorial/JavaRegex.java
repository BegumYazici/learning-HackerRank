package HackerRankExamples.JavaTutorial;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();

        String[] array = words.split(" ");

        String[] newArray = new String[array.length];

        for(int l=0; l<array.length; l++){
            newArray[l] =array[l] ;
        }

        for (int i = 0; i < array.length-1; i++) {

            for (int j = 1; j < array.length; j++) {

                if(array[i]==array[j]){

                    array[j]=" ";
                }
            }
        }


    }
}
