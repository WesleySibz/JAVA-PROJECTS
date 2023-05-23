import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder B = new StringBuilder();

        // append a string into StringBuilder B
        B.append(A);

        // reverse StringBuilder B
        B = B.reverse();

        // converting StringBuilder into String using toString.

        if ((A.compareTo(B.toString()) == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
