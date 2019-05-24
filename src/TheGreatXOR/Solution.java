package TheGreatXOR;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the theGreatXor function below.
    static long theGreatXor(long x) {
        String s = Long.toBinaryString(x);
        int l = s.length();
        long ans = (long)Math.pow(2,l)-x-1;
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long x = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = theGreatXor(x);

            System.out.println(result);
        }

        scanner.close();
    }
}
