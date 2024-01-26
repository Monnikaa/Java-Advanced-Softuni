package _1StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5

        String[] exp = input.split("");
        //["1", "+", "(2", "-", "(2", "+", "3)"

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i <= exp.length; i++) {

            if (exp[i].equals("(")) {
                stack.push(exp[i]);
            } else if (exp[i].equals(")")) {

            }
        }

    }
}
