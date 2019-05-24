package SockMerchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int[] unique = {};
        for(int i=0;i<n;i++){
            final int key = ar[i];
            if(!Arrays.stream(unique).anyMatch(f -> f == key)){
                unique = Arrays.copyOf(unique,unique.length+1);
                unique[unique.length-1] = ar[i];
            }
        }
        int pairs=0;
        for(int item : unique){
            int occurrances=0;
            for(int i=0;i<n;i++){
                if(item == ar[i]){
                    occurrances++;
                }
            }
            pairs += Math.floor(occurrances/2);
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
