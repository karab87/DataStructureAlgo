package com.atak.arrays;

public class MaxConsecutivesOneClasse {

    //o(N*N)
    //O(1) aux space
    public static int naiveMaxCscutveOnses(boolean[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == true) curr++;
                else break;
            }
            res = Math.max(curr, res);
        }
        return res;
    }

    //o(N)
    //O(1) aux space
    public static int maxCscutveOnses(boolean[] arr) {
        int res = 0;
        int n = arr.length;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == false) {
                curr = 0;
            } else {
                curr++;
                res = Math.max(curr, res);
            }

        }
        return res;
    }
}
