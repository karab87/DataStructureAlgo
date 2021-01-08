package com.atak.arrays;

public class SecondLargest {

    public static int secondLargest(int arr[]){

        int largest = LargestElementInArray.getLarget(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest]){
                if(res == -1)
                    res = i;
                else if (arr[i]>arr[res])
                    res = i;
            }
        }
        return res;
    }


    public static int secondLarget(int arr[]){
        int res = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }else if(arr[i]!=arr[largest]){
                if(res == -1 || arr[i]>arr[res])
                    res = i;
            }
        }
        return res;
    }
}

