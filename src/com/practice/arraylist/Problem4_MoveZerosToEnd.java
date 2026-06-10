package com.practice.arraylist;

import java.util.ArrayList;

public class Problem4_MoveZerosToEnd {
    public static void moveZeros(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) return;
        int writePos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(writePos++, list.get(i));
            }
        }
        while (writePos < list.size()) {
            list.set(writePos++, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0); list.add(1); list.add(0); list.add(3); list.add(12);
        System.out.println("Input: " + list);
        moveZeros(list);
        System.out.println("Output: " + list);
    }
}
