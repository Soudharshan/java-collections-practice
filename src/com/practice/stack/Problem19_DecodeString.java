package com.practice.stack;

import java.util.Stack;

public class Problem19_DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(k);
                strStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                StringBuilder temp = current;
                current = strStack.pop();
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) current.append(temp);
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println("3[a2[c]] -> " + decodeString("3[a2[c]]"));
    }
}
