package RepeatedString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        String buffer="";
        double count = 0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count  ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        //gfcaaaecbg
        //547602
        //164280
        return (long)count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}
