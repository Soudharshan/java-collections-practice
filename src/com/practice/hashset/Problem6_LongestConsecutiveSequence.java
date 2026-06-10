package com.practice.hashset;

import java.util.HashSet;

public class Problem6_LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int longest = 0;
        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while (set.contains(n + len)) len++;
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Input: [100,4,200,1,3,2]");
        System.out.println("Longest consecutive length: " + longestConsecutive(arr));
    }
}
