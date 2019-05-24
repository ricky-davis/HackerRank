package HourGlassSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max=-99999;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                int curC=0;
                int tLeft=arr[i][j];
                int tMid=arr[i][j+1];
                int tRight=arr[i][j+2];
                int middle=arr[i+1][j+1];
                int bLeft=arr[i+2][j];
                int bMid=arr[i+2][j+1];
                int bRight=arr[i+2][j+2];
                curC+=tLeft+tMid+tRight+middle+bLeft+bMid+bRight;
//                System.out.println(tLeft+"  "+tMid+"  "+tRight);
//                System.out.println("   "+middle+"   ");
//                System.out.println(bLeft+"  "+bMid+"  "+bRight);
                if(curC>max)max=curC;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
