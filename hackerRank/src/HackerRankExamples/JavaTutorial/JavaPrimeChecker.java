package HackerRankExamples.JavaTutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.Vector;

import static java.lang.System.in;

public class JavaPrimeChecker {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            int[] arr = new int[5];
            arr[1] = n1;
            arr[2] = n2;
            arr[3] = n3;
            arr[4] = n4;
            arr[0] = n5;

            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Vector<String> set = new Vector<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Prime {

    int counter=0;

    public void checkPrime(int ... arr){

        for(int i=0; i<arr.length; i++){
            for(int j=2; j<arr[i] ; j++){
                if(arr[i]%j==0){
                    counter++;
                }
            }
            if(counter == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
