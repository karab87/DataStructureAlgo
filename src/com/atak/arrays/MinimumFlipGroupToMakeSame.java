package com.atak.arrays;

public class MinimumFlipGroupToMakeSame {

    public static void printFlipGroup(boolean[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[0])
                    System.out.println("From " + i + " to");
                else
                    System.out.println(i - 1 + " end");
            }
        }
        if (arr[arr.length - 1] != arr[0])
            System.out.println(arr[arr.length - 1]);
    }
}
