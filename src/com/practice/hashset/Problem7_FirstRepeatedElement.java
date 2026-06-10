package com.practice.hashset;

import java.util.HashSet;

public class Problem7_FirstRepeatedElement {
    public static int firstRepeated(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) return num;
            seen.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 2, 3, 5};
        System.out.println("First repeated: " + firstRepeated(arr));
    }
}
