import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        String US = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String India = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + US);
        System.out.println("India: " + India);
        System.out.println("China: " + China);
        System.out.println("France: " + France);
    }
}