package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Problem2_RotateArrayList {
    public static ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k) {
        if (list == null || list.isEmpty()) return list;
        int n = list.size();
        k = k % n;
        if (k == 0) return list;
        Collections.reverse(list);
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        return list;
    }

    private static void reverse(ArrayList<Integer> list, int left, int right) {
        while (left < right) {
            Collections.swap(list, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        int k = 2;
        System.out.println("Input: " + list + ", k=" + k);
        System.out.println("Output: " + rotateRight(list, k));
    }
}
