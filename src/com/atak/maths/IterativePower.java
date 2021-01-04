package com.atak.maths;

//Binary exponentiation
public class IterativePower {

    public static int power(int x, int n) {
        int res = 1;

        while ((n > 0)) {

            if (n % 2 != 0)
                res = res * x;
            x = x * x;

            n = n / 2;//n>>2

        }
        return res;
    }

    //use modulo to avoid overflow
    //time logn
    //aux space c
    public static int overflowPower(int x, int n, int mod) {
        int res = 1;
        while ((n > 0)) {
            if (n % 2 != 0)
                res = (res * x) % mod;
            x = (x * x) % mod;

            n = n / 2;//n>>2

        }
        return res;
    }
}
