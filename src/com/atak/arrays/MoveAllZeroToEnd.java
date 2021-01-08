package com.atak.arrays;

public class MoveAllZeroToEnd {

    public static void naiveMoveToEnd(int[ ] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] ==0)
                for (int j = i+1; j < arr.length; j++)
                    if(arr[i] != 0)
                        ReverseArray.swap(arr[i],arr[j]);
        }
    }

    public static void moveToEnd(int[ ] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                ReverseArray.swap(arr[i],arr[count]);
            }
        }
    }
}
