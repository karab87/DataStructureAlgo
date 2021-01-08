package com.atak.arrays;

public class MaxCircularSubArraySum {

    //O(n*n)
    public static int naiveMaxCircularSubArraySum(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int index = (i + j)%arr.length;
                curr_sum += arr[index];
                curr_max = Math.max(curr_sum,curr_max);
            }
            res = Math.max(res,curr_max);

        }
        return res;
    }


    //O(n)
    public static int maxCircularSubArraySum(int[] arr){
        //normal sum
        int normal_max = normalMaxSum(arr);
        if(normal_max<0)
            return normal_max;
        //circular sum
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
             arr_sum += arr[i];
            arr[i]= -arr[i];

            }
            int max_circular = arr_sum + normalMaxSum(arr);

        return Math.max(normal_max,max_circular);
    }

    //standard Kadane
    public static int normalMaxSum(int arr[]) {
        int res = arr[0], max_ending = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_ending = Math.max(arr[i], max_ending + arr[i]);
            res = Math.max(res, max_ending);
        }
        return res;
    }


}

