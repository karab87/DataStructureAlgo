package com.atak.maths;

public class CheckForPrimeNumber {

    //Theta   n
    public static boolean naiveIsPrime(int n){
        if(n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    //Theta racine de n
    public static boolean efficientIsPrime(int n){
        if(n == 1)
            return false;
        for (int i = 2; i*i <= n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

    //
    public static boolean moreEfficientIsPrime(int n){
        if(n == 1)
            return false;
        if(n == 2 || n ==3)
            return true;
        for (int i = 5; i*i <=n; i=i+6) {
            if(n%i == 0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
