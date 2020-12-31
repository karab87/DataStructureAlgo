package com.atak.analyse;

public class AnalyseRecursion {
    //T(n)=2T(n/2)+cn
    //T(1)=c
    //Theta nlogn
    void fun(int n){
        if(n<1){
            return ;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("GFG");
            fun(n/2);
            fun(n/2);
        }
    }

    //T(n)=2T(n-1)+c
    //T(1)=c
    //Theta 2 puissance n

    //T(n)=T(n/2)+c
    //T(1)=c
    //Theta logn

    //T(n)= 2T(n/2)+c
    //T(1)=c
    //Theta n

    //T(n)= T(n/4)+ T(n/2)+cn
    //T(1)=c
    //Theta n

    //T(n)= T(n-1)+ T(n-2)+c
    //T(1)=c
    //Theta 2 puissance n
}
