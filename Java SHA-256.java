import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        try {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine().trim();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(s.getBytes());
            byte[] thedigest = md.digest();
            for (byte b : thedigest) {
                System.out.printf("%02x", b);
            }

            System.out.println();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
    }
}
