package JumpingOnClouds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps=0;
        if(c.length>2){
            for(int i=0;i<c.length-2;){
                if(c[i+2] == 0){
                    System.out.println("Hit "+(i+2)+" and jumped");
                    jumps++;
                    i+=2;
                }else{
                    jumps++;
                    i++;
                }
                if(i==c.length-2)jumps++;
            }
        }else{
            jumps=1;
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}
