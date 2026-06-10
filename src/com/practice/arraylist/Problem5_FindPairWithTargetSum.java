package com.practice.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem5_FindPairWithTargetSum {
    public static boolean hasPairWithSum(ArrayList<Integer> list, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : list) {
            if (seen.contains(target - num)) return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(7); list.add(11); list.add(15);
        int target = 9;
        System.out.println("Input: " + list + ", target=" + target);
        System.out.println("Pair exists? " + hasPairWithSum(list, target));
    }
}
