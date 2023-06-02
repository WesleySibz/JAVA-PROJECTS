import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        BigInteger bi = new BigInteger(a);

        System.out.println(bi.add(new BigInteger(b)));
        System.out.println(bi.multiply(new BigInteger(b)));
    }
}