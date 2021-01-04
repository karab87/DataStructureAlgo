package com.atak.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class SieveOfEratosthenes {

    //theta n*racine(n)
    public static void naivePrintPrimes(int n){

        for (int i = 2; i < n; i++) {
            if(CheckForPrimeNumber.moreEfficientIsPrime(n))
                System.out.println(i);
        }
    }

    //simple implememtation of sieve
    public static void seive(int n){
        if(n <= 1)
            return;

        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i<= n; i++) {
            if(isPrime[i])
                for (int j = 2*i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
        }

        for (int i = 2; i<= n; i++) {
            if(isPrime[i])
                System.out.println(i);
        }
    }


    //optimised implememtation of sieve
    public static void optimisedSeive(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i<= n; i++) {
            if(isPrime[i])
                //optimisation
                //has small divisor than i no need to consider them again
                for (int j = i*i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
        }

        for (int i = 2; i<= n; i++) {
            if(isPrime[i])
                System.out.println(i);
        }
    }

    //SHORT optimised implememtation of sieve
    //nlog log n

    public static void shortOptimisedSeive(int n){
        boolean[] isPrime = new boolean[n+1];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i<= n; i++) {
            if(isPrime[i])
                System.out.println(i);
            for (int j = i*i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
        }
    }


}
