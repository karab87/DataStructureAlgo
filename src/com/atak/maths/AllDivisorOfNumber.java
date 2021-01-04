package com.atak.maths;

public class AllDivisorOfNumber {

    public static void naivePrintDivisors(int n) {
        for (int i = 1; i < n; i++) {
            if (n%i==0)
                System.out.println(i);
        }
    }


    public static void efficientPrintDivisors(int n) {
        for (int i = 1; i*i < n; i++) {
            if (n%i==0){

                System.out.println(i);
                if(i!=(n/i))
                    System.out.println(n/i);
            }

        }
    }


    //theta racine
    public static void noreEfficientPrintDivisors(int n) {
        int i = 1;
        //print all divisors fron 1(inclusive) to racine de n (exclusive)
        //theta racine

        for ( i = 1; i*i < n; i++) {
            if (n%i==0){
                System.out.println(i);
            }
        }
        //print all divisors fron racine de n (exclusive) (inclusive) to n
        //theta racine
        for ( ; i>=1; i--) {
                if(n%i==0)
                    System.out.println(n/i);
        }
    }
}
