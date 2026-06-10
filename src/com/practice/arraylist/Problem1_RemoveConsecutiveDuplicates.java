package com.practice.arraylist;

import java.util.ArrayList;

public class Problem1_RemoveConsecutiveDuplicates {
    public static ArrayList<Integer> removeConsecutiveDuplicates(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) return list;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(1); list.add(2); list.add(2); list.add(2);
        list.add(3); list.add(1); list.add(1); list.add(4);
        System.out.println("Input: " + list);
        System.out.println("Output: " + removeConsecutiveDuplicates(list));
    }
}
