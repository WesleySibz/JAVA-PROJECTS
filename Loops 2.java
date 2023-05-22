import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            int l = 1;
            for (int j = 1; l <= n; j = j * 2) {
                s = s + j * b;
                System.out.print(s + " ");
                l++;
            }
            System.out.println();
        }
        in.close();
    }
}