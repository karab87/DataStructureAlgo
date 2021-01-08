package com.atak.arrays;

public class WindowsSlidingTechnic {
    //O((n-k)*k)
    public static int naiveFindMaximSumOfKConsecutiveNumber(int[] arr, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
                max_sum = Math.max(sum, max_sum);
            }
        }
        return max_sum;
    }

    public static int findMaximSumOfKConsecutiveNumber(int[] arr, int k) {

        int curr_sum = 0;
        for (int j = 0; j < k; j++) {
            curr_sum += arr[j];
        }
        int max_sum = curr_sum;
        for (int i = k; i < arr.length; i++) {
            curr_sum += (arr[i] - arr[i - k]);
            max_sum = Math.max(curr_sum, max_sum);
        }
        return max_sum;
    }

    public static boolean naiveFindIfIsArrayWithGivenSum(int[] arr, int givenSum) {

        for (int j = 0; j < arr.length; j++) {
            int sum = 0;
            for (int i = j; i < arr.length; i++) {
                sum += arr[i];
                if (sum == givenSum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findIfIsArrayWithGivenSum(int[] arr, int givenSum) {

        int curr_sum = arr[0], start = 0;
        for (int end = 1; end < arr.length; end++) {
            //clean prev windows
            while (curr_sum > givenSum && start < end - 1) {
                curr_sum -= arr[start];
                start++;
            }
            if (curr_sum == givenSum)
                return true;
            if (end < arr.length)
                curr_sum += arr[end];

        }
        return curr_sum == givenSum;
    }
}
