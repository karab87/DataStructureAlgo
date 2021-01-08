package com.atak.arrays;

public class Operations {

    //unsorted array
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //O(n)
    //at end in O(1)
    //at beginning theta de n
    public static int insert(int[] arr, int x, int cap, int pos){
        if(cap == arr.length)
            return arr.length;
        int idx = pos -1;
        for (int i = arr.length - 1; i >= idx; i--) {
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return arr.length+1;
    }

    //
    public int delete(int arr[], int x){
        int i = 0;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                break;
        }
        if(i == arr.length)
            return arr.length;
        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j+1];
        }
        return arr.length-1;
    }

}
