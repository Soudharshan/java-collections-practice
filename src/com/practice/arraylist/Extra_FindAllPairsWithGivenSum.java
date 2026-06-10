package com.practice.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Extra_FindAllPairsWithGivenSum {
    public static List<int[]> findAllPairs(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> added = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String key = a + "," + b;
                if (!added.contains(key)) {
                    pairs.add(new int[]{a, b});
                    added.add(key);
                }
            }
            seen.add(num);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        int target = 6;
        List<int[]> pairs = findAllPairs(arr, target);
        System.out.print("Pairs: ");
        for (int[] p : pairs) System.out.print("(" + p[0] + "," + p[1] + ") ");
    }
}
