package com.atak.arrays;

public class FrequencyInSortedArray {
    public static void printFrequency(int[] arr){
        int freq = 1, i = 1;
        while (i<arr.length){
            while (i < arr.length && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }
    }
}
