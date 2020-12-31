package com.atak.analyse;

public class CommonLoop {
    int n = (int) Math.random(), c = (int) Math.random();

    void analyseLoups() {
        //Theta n/c = Theta n
        for (int i = 0; i < n; i += c) {
            //somme constant work
        }

        //Theta n/c = Theta n
        for (int i = n; i > 1; i -= c) {
            //somme constant work
        }

        //Theta logn
        for (int i = 1; i < n; i *= c) {
            //somme constant work
        }

        //Theta logn
        for (int i = n; i > 1; i /= c) {
            //somme constant work
        }

        //Theta loglogn
        for (int i = 2; i < n; i = (int) Math.pow(i, c)) {
            //somme constant work
        }

    }
    //Theta n
    void func(int n) {
        //Theta n
        for (int i = 0; i < n; i++) {
            //somme constant work
        }

        //Theta logn
        for (int i = 1; i < n; i *= 2) {
            //somme constant work
        }

        //Theta 1
        for (int i = 0; i < 100; i++) {
            //somme constant work
        }
    }
    //Theta n*logn
    void fun(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                //somme constant work
            }
        }
    }

    //Theta n*n
    void fun1(int n) {
        //Theta n*logn
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                //somme constant work
            }
        }
        //Theta n*n
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j ++) {
                //somme constant work
            }
        }
    }
}
