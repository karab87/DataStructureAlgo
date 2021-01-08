package com.atak.arrays;

public class MajorityElement {
    //O(n*n)
    public static int naiveMajorityElmt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length / 2)
                return i;
        }
        return -1;
    }

    //O(n)
    public static int majorityElmt(int arr[]) {
        int res = 0, count = 1;
        //find a candidate
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        //find a candiate is actually a majority
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
        }
        if (count <= arr.length / 2)
            return -1;
        return res;
    }
}
