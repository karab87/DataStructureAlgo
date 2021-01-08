package com.atak.arrays;

public class LRotate {
    public static void leftRotateOne(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void naiveLeftRotateByD(int arr[], int d) {
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr);
        }
    }

    //theta n
    //theta d aux
    public static void betterLeftRotateByD(int arr[], int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            temp[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[arr.length -d + i] = temp[i];
        }
    }

    //theta n
    //theta 1 aux
    public static void leftRotateByD(int arr[], int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }


    public static void reverse(int arr[], int low, int hight){
        while (low < hight){
            //swqp
            ReverseArray.swap(arr[low],arr[hight]);
            low++;
            hight--;
        }
    }
}
