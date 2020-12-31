package com.atak.analyse;

public class Somme {

    //cn + c
    //order n
    int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //best case : constant
    //average : lineare under the assumption that the even and odd are equals
    //worst case : lineare
    int getSum1(int[] arr, int n) {
        int sum = 0;

        if (n %2 == 0)
            return 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
