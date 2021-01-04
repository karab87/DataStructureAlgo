package com.atak.maths;

public class CountDigit {

    //Theta d
    public static int interativeCountDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }

        return count;
    }


    public static int recursiveCountDigit(long n) {

        if(n == 0)
            return 0;
        return 1 + recursiveCountDigit(n/10);
    }


    public static int logaritmicCountDigit(long n) {
        return (int) Math.floor(Math.log10(n)+1);
    }
}
