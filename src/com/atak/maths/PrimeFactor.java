package com.atak.maths;

public class PrimeFactor {
    //n*n*logn
    public static void naivePrimeFactor(int n){
        //n
        for (int i = 2; i < n; i++) {
            //n
            if(CheckForPrimeNumber.moreEfficientIsPrime(n))
            {
                int x =i;
                //log(n)
                while (n % x ==0){
                    System.out.println(i);
                    x = x *i;
                }
            }
        }
    }

    public static void efficientPrimeFactor(int n){
        if(n<=1)
            return;
        for (int i = 2; i * i <= n; i++) {
            while (n%i == 0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    }

    public static void moreMorefficientPrimeFactor(int n){
        if(n<=1)
            return;
        while (n%2 == 0)
        {
            System.out.println(2);
            n=n/2;
        }
        while (n%3 == 0)
        {
            System.out.println(3);
            n=n/3;
        }
        for (int i = 5; i * i <= n; i=i+6) {
            while (n%i == 0)
            {
                System.out.println(i);
                n=n/i;
            }

            while (n%(i+2) == 0)
            {
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3)
            System.out.println(n);
    }
}
