package com.atak.analyse;

/*
order of growth of memory (or Ram) space in terms of input size

Auxiliary space : order of growth of extra space or temporary space in term of input size
 */
public class SpaceComplexity {

    private int c;

    //Theta 1
    int getSum(int n) {
        return n * (n + 1);
    }

    //Theta 1
    int getSum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //Auxiliary space Theta 1
    //space complexity Theta n
    int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //space complexity Theta n
    int fun(int n){
        if(n<=0)
            return 0;
        return n + fun(n-1);
    }
    //space complexity Theta n
    int fib(int n){
        if(n == 0 || n ==1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    //space complexity Theta 1
    int fib1(int n){
        if(n == 0 || n ==1)
            return n;
        int a =0, b =1;
        for (int i = 2; i < n; i++) {
            c = a+b;
            a = b;
            b= c;
        }
        return c;
    }

    //space complexity Theta n
    int fib2(int n){
        int[] tab = new int[n+1];
       tab[0]  = 0;
       tab[1] = 1;
        for (int i = 2; i < n; i++) {
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }
}
