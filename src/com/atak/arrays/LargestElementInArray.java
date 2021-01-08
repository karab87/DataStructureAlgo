package com.atak.arrays;

public class LargestElementInArray {

    //O(n*n)
    public static int naiveIntGetLarget(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return i;
        }
        return -1;
    }

    public static int getLarget(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[res])
                res = i;
        }
        return res;
    }
}
