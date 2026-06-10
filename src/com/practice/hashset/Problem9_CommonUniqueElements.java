package com.practice.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem9_CommonUniqueElements {
    public static List<Integer> commonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) resultSet.add(num);
        }
        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4};
        System.out.println("Common: " + commonElements(arr1, arr2));
    }
}
