package FlippingBits;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {
        String s = Long.toBinaryString(n);
        s = ("00000000000000000000000000000000" + s).substring(s.length());
        s = s.replace('0', '2').replace('1', '0').replace('2', '1');
        long ans = new BigInteger(s, 2).longValue();
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            System.out.println(result);
        }
        scanner.close();
    }
}
