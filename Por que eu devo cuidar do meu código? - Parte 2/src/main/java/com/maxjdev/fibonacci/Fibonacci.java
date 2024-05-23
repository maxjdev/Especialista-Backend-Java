package com.maxjdev.fibonacci;

import java.util.Arrays;

public class Fibonacci {
    private static final int MAX_ELEMENTS = 100;
    private static final int[] fibElements = new int[MAX_ELEMENTS];

    public static int findElementDP(int e) {
        Arrays.fill(fibElements, -1);
        return findElement(e);
    }

    private static int findElement(int e) {
        if (fibElements[e] == -1) {
            if (e <= 1) {
                fibElements[e] = e;
            } else {
                fibElements[e] = findElement(e - 1) + findElement(e - 2);
            }
        }
        return fibElements[e];
    }

    public static void main(String[] args) {
        System.out.println(findElementDP(7));
    }
}
