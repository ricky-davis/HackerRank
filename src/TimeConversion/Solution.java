package TimeConversion;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String [] ar = s.split(":");
        if(s.contains("PM")){
            if(!ar[0].equals("12"))
                ar[0] = Integer.toString(Integer.parseInt(ar[0])+12);
        }else{
            if(ar[0].equals("12"))ar[0]="00";
        }
        s = String.join(":",ar);
        s = s.substring(0, s.length()-2);
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
