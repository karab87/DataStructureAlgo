package com.atak.arrays;

public class Leader {

    //O(N*N)
    public static void naiveLeaders(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]  <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.println(arr[i]);
        }
    }

    //O(N)
    public static void leaders(int[] arr){
        int curr_ldr = arr[arr.length-1];
        System.out.println(curr_ldr);
        for (int i = arr.length-2; i >=0; i--) {
                if(curr_ldr  < arr[i]){
                    curr_ldr = arr[i];
                    System.out.println(curr_ldr);
                }

        }
    }

}
