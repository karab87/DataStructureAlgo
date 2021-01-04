package com.atak.maths;

public class LastCommomMultiple {

    //O(a*b -max(a,b))
    int naiveLcm(int a, int b){
        int res = Math.max(a, b);

        while (!(res%a == 0 && res%b==0)){
            res++;
        }
        return res;
    }


    //a*b = gcd(a,b)*lcm(a,b)
    int efficientLcm(int a, int b){
        return (a*b)/GreatestCommonDivisor.euclidienGcdOptimised(a, b);
    }
}
