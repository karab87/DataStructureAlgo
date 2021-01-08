package com.atak.arrays;

public class MaxSumSubArrayClasse {
    //o(N*N)
    public static int naiveMaxum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[i];
                res = Math.max(res, curr);
            }
        }
        return res;
    }


    //O(n)
    public static int maxum(int[] arr, int sum) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

}
