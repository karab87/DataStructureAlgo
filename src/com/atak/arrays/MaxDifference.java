package com.atak.arrays;

public class MaxDifference {
    public int naiveMaxDiff(int arr[]) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    public int maxDiff(int arr[]) {
        int res = arr[1] - arr[0], minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
                res = Math.max(res, arr[i] - minVal);
                minVal = Math.min(arr[i],  minVal);
        }
        return res;
    }
}
