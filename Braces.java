import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser {
    static String isBalanced(String s) {
        Stack<Character> str = new Stack();
        String ans = "true";
        String no = "false";
        boolean answer = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                str.push(ch);
                continue;
            }
            if (str.isEmpty()) {
                return no;

            }
            if (ch == ')') {
                if (str.peek() == '(') {
                    str.pop();
                } else {
                    answer = false;
                    break;
                }
            }
            if (ch == ']') {
                if (str.peek() == '[') {
                    str.pop();
                } else {
                    answer = false;
                    break;
                }
            }
            if (ch == '}') {
                if (str.peek() == '{') {
                    str.pop();
                } else {
                    answer = false;
                    break;
                }
            }

        }
        if (!str.isEmpty()) {
            answer = false;
        }
        if (answer)
            return ans;
        else
            return no;
    }
}

class Solution {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}