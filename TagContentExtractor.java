import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            // Write your code here
            String regex = "<(.+)>([^<]+)<(/\\1)>";

            boolean matchAvailable = false;
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            // if(line.matches(regex)) System.out.println("test");

            while (m.find()) {
                matchAvailable = true;
                System.out.println(m.group(2));
            }

            if (!matchAvailable)
                System.out.println("None");

            testCases--;
        }
    }
}