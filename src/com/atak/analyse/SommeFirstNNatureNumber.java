package com.atak.analyse;

public class SommeFirstNNatureNumber {

    //c1
    int fun1(int n) {
        return n * (n + 1);
    }

    //cn+c
    int fun2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //cn2+cn+c
    int fun3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }
}
