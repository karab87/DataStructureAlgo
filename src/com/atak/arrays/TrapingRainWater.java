package com.atak.arrays;

public class TrapingRainWater {
    public static int naiveGetWater(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res = res + (Math.min(lMax, rMax) - arr[i]);
        }
        return res;
    }

    public static int getWater(int arr[]) {
        int res = 0;
        int lMax[] = new int[arr.length];
        int rMax[] = new int[arr.length];

        lMax[0] = arr[0];
        for (int j = 1; j < arr.length; j++) {
            lMax[j] = Math.max(lMax[j-1], arr[j]);
        }

        rMax[arr.length-1] = arr[arr.length-1];
        for (int j = arr.length - 2; j >= 0; j--) {
            rMax[j] = Math.max(rMax[j+1], arr[j]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return res;
    }
}
