package com.atak.maths;

public class GreatestCommonDivisor {

    public static int gcd(int a, int b){
        int res = Math.max(a,b);
        while (res>0){
            if(a%res ==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static int euclidienGcd(int a, int b){
        while (a != b){
            if(a>b)
                a = a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static  int euclidienGcdOptimised(int a, int b){
        if(b == 0)
            return a;
        else
            return euclidienGcdOptimised(b, a%b);
    }
}
