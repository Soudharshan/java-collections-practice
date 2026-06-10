package com.practice.arraylist;

import java.util.Arrays;

public class Extra_MergeTwoSortedArrays {
    public static void mergeWithoutExtraSpace(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                if (j < n && arr1[i] > arr1[j]) {
                    swap(arr1, i, j);
                } else if (i < n && j >= n && arr1[i] > arr2[j - n]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                } else if (i >= n && j >= n && arr2[i - n] > arr2[j - n]) {
                    swap(arr2, i - n, j - n);
                }
                i++;
                j++;
            }
            gap = (gap == 1) ? 0 : (gap + 1) / 2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        mergeWithoutExtraSpace(arr1, arr2);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
