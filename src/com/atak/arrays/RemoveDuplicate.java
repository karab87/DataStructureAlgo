package com.atak.arrays;

public class RemoveDuplicate {
    //time O(n)
    //space O(n)
    public static int naiveRemDuplicate(int arr[]){
        int temp[] = new int[arr.length];
        temp[0] =  arr[0];
        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }


    //time O(n)
    //space O(1)
    public static int remDuplicate(int arr[]){
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[res-1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}

