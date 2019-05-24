package CountingValleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyCounter =0;
        byte vorm = 0;
        int curLevel=0;
        for(int i=0;i<s.length();i++){
            String cur = s.substring(i,i+1);
            int posNeg = cur.equals("U")?1:-1;
            curLevel+=posNeg;
            if(curLevel == -1 && posNeg == -1){
                valleyCounter++;
            }
        }
        return valleyCounter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}
