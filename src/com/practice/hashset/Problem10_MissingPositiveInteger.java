package com.practice.hashset;

import java.util.HashSet;

public class Problem10_MissingPositiveInteger {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) if (n > 0) set.add(n);
        int i = 1;
        while (set.contains(i)) i++;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + firstMissingPositive(arr));
    }
}
