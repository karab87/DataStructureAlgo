package com.atak.maths;

public class PalindromeNumber {
    /*
        Traverse digits from right to left to find reverse of given number
        Theta d
     */
    public static boolean isPal(int n) {
        int rev = 0;
        int temp = n;
        while ( temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return rev ==n;
    }
}
