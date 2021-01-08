package com.atak.arrays;

public class ReverseArray {

    //theta n
    //aux space theta 1
    public static void reverseArray(int arr[]){
        int low = 0, hight = arr.length-1;
        while (low < hight){
            //swqp
            int temp = arr[low];
            arr[low]=arr[hight];
            arr[hight] = temp;
            low++;
            hight--;
        }
    }

    public static void swap(int i, int j){

            int temp = i;
            i=j;
             j= i;
        }

}
