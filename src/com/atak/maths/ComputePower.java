package com.atak.maths;

public class ComputePower {
    public static int naivePower(int x, int n){
        int res = 1;
        for (int i = 0; i < n; i++) {
            res= res*x;
        }
        return res;
    }

    //t(n) = t(n/2) + c
    public static int efficientPower(int x, int n){
       if(n==0)
           return 1;
       int temp = efficientPower(x,n/2);
       temp = temp*temp;
       if(n%2 == 0)
           return temp;
       else
           return temp * x;
    }
}
