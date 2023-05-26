import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if (s.length() > 0) {
            String sarray[] = s.split("[ !,?._'@]+");
            System.out.println(sarray.length);
            for (int i = 0; i < sarray.length; i++) {
                System.out.println(sarray[i]);
            }
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
