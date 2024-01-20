package _1StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (num != 0){
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
