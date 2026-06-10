package com.practice.stack;

import java.util.Arrays;
import java.util.Stack;

public class Problem17_NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("NGE: " + Arrays.toString(nextGreaterElement(arr)));
    }
}
