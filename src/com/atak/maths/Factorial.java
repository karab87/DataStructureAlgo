package com.atak.maths;

public class Factorial {

    /*
    interative solution
     */
    public static int iterativeFact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res =  res *i ;

        }
        return res;
    }


    /*
    recursive solution
    assune that n > 0
    Time complexity : t(n) = t(n-1) + c
     */
    public static int recursiveFact(int n) {
      if(n==0)
          return 1;
      return n * recursiveFact(n-1);
    }
}
