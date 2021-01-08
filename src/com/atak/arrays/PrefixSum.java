package com.atak.arrays;

import java.util.ArrayList;

public class PrefixSum {
    public static int naiveGitSum(int[] arr, int l, int r){
        int sum = 0;
        for (int i = l; i < r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] prefixSun(int[] arr){
        int prefArray[] = new int[arr.length];
        prefArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefArray[i] = prefArray[i-1] + arr[i];
        }
        return prefArray;
    }

    public static int gitSum(int[] arr, int l, int r){
        int prefArray[] = prefixSun(arr);
        if(l!=0)
            return prefArray[r] - prefArray[l-1];
        else
            return prefArray[r];
    }
    public static boolean naiveEquilibrum(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int lsum = 0, rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum+=arr[j];
            }
            for (int k = i+1; k < arr.length; k++) {
                rsum+=arr[k];
            }
            if (lsum == rsum) {
                return true;
            }
        }
        return false;
    }

    public static boolean equilibrum(int[]arr){
        int sum =0;
        int lsum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (lsum == sum-arr[i]) {
                return true;
            }
            lsum+=arr[i];
            sum-=arr[i];
        }
        return false;
    }

    public static int findMaxAppearingElementInRange(int l[], int r[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(l[i],1);
            arrayList.add(r[i]+1,-1);
        }
        int maxm = arrayList.get(0), res = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            arrayList.set(i,arrayList.get(i)+arrayList.get(i-1));
            if(maxm<arrayList.get(i)){
                maxm = arrayList.get(i);
                res = i;
            }
        }
        return res;
    }
}
