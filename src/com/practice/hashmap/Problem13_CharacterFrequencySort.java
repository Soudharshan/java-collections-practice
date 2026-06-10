package com.practice.hashmap;

import java.util.*;

public class Problem13_CharacterFrequencySort {
    public static String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < freq.get(c); i++) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
