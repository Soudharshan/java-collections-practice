package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Problem3_LeadersInArray {
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        if (arr == null || arr.isEmpty()) return leaders;
        int maxFromRight = arr.get(arr.size() - 1);
        leaders.add(maxFromRight);
        for (int i = arr.size() - 2; i >= 0; i--) {
            if (arr.get(i) > maxFromRight) {
                maxFromRight = arr.get(i);
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(16); arr.add(17); arr.add(4); arr.add(3); arr.add(5); arr.add(2);
        System.out.println("Input: " + arr);
        System.out.println("Leaders: " + findLeaders(arr));
    }
}
