package com.atak.analyse;
/*
O (1): La complexité temporelle d'une fonction (ou d'un ensemble d'instructions) est considérée comme O (1) si elle ne contient pas de boucle,
de récursivité et d'appel à toute autre fonction temporelle non constante.
// ensemble d'instructions non récursives et non boucle
Par exemple, la fonction swap () a une complexité temporelle O (1).
Une boucle ou une récursivité qui s'exécute un nombre constant de fois est également considérée comme O (1)

O (n): La complexité temporelle d'une boucle est considérée comme O (n) si les variables de la boucle sont incrémentées / décrémentées d'une
quantité constante. Par exemple, les fonctions suivantes ont une complexité temporelle O (n).

O (n c ) : La complexité temporelle des boucles imbriquées est égale au nombre d'exécutions de l'instruction la plus interne. Par exemple, les exemples de boucles suivants ont une complexité temporelle O (n 2 )

O (Logn) : La complexité temporelle d'une boucle est considérée comme O (Logn) si les variables de boucle sont divisées / multipliées par une quantité constante.

O (LogLogn) : la complexité temporelle d'une boucle est considérée comme O (LogLogn) si les variables de boucle sont réduites / augmentées
de façon exponentielle d'une quantité constante.


 */
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
