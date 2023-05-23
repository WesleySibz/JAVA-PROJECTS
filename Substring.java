import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String substr = S.substring(start, end);
        // Here we uses a function substring to require substring from complet string S.
        // It will give index value of [Start,end)
        System.out.print(substr);
    }
}