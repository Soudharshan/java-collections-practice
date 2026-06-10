package com.practice.hashmap;

import java.util.*;

public class Problem15_FindDuplicateFileNames {
    public static List<String> findDuplicates(String[] files) {
        Map<String, Integer> count = new HashMap<>();
        for (String f : files) {
            count.put(f, count.getOrDefault(f, 0) + 1);
        }
        List<String> duplicates = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) duplicates.add(entry.getKey());
        }
        return duplicates;
    }

    public static void main(String[] args) {
        String[] files = {"resume.pdf", "photo.png", "resume.pdf"};
        System.out.println(findDuplicates(files));
    }
}
