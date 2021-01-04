package com.atak.maths;

import java.util.ArrayList;

public class Tasks {

    /*
    You are given an interger I, find the absolute value of the interger I.
    Expected Time Complexity: O(1)
    Expected Auxiliary Space : O(1)
     */
    public int absolute(int I) {
        // code here
        if (I < 0)
            return -1 * I;
        return I;
    }

    /*
     *Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.
     * Expected Time Complexity: O(1)
    Expected Auxiliary Space : O(1)
     */
    public double cToF(int C) {
        //conversion formula
        double f = (int) (((C * 9.0) / 5.0) + 32);
        return f;
    }

    /*
     *Given a quadratic equation in the form ax2 + bx + c. Find its roots.
     * Expected Time Complexity: O(1)
    Expected Auxiliary Space : O(1)
     */
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<Integer>();
        int root1 = 0, root2 = 0;
        // value of b^2-4ac
        int temp = (int) (Math.pow(b, 2) - 4 * a * c);

        // if b^2-4ac is less then zero then roots are imaginary
        if (temp < 0)
            roots.add(-1);
        else {
            // root1
            root1 = (int) Math.floor((-1 * b + Math.sqrt(temp)) / (2 * a));
            // root2
            root2 = (int) Math.floor((-1 * b - Math.sqrt(temp)) / (2 * a));
            roots.add(Math.max(root1, root2));
            roots.add(Math.min(root1, root2));
        }
        return roots;

    }

    /*
     *Given a positive integer N. The task is to find factorial of N.
     * Expected Time Complexity : O(N)
    Expected Auxilliary Space : O(1)
     */
    static long factorial(int N) {
        long ans = 1; // answer should be stored in long long as it may overflow
        // the int
        for (int i = 2; i <= N; i++) {
            ans = ans * i; // calculating the factorial
        }
        return ans;
    }

    /*
    *Given an integer N. Find the number of digits that appear in its factorial.
    *Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
    *     log(q*b) = loga + logb
    * Expected Time Complexity : O(N)
    Expected Auxilliary Space : O(1)
     */
    static int digitsInFactorial(int N) {
        double sum = 0.0; //to store the sum of log n +log (n-1)+...
        for (int j = 1; j <= N; j++) {
            sum += Math.log10(j);

        }
        return (int) (1 + Math.floor(sum));
    }


    /*
     *Given the first 2 terms A and B of a Geometric Series.
     * The task is to find the Nth term of the series.
     * Expected Time Complexity : O(logN)
Expected Auxilliary Space : O(1)
     */
    public static double termOfGP(int A, int B, int N) {
        //Your code here
        double r = ((double) B) / A; //common ratio is given by r=b/a
        return (A * Math.pow(r, N - 1)); //nth term is given by an=a(r^(n-1))
    }

    /*
    *A prime number is a number which is only divisible by 1 and itself.
    *Given number N check if it is prime or not.
     *
      *Count the number of factors. If the factors of a number is 1 and itself, then the number is prime.
    *You can check this optimally by iterating from 2 to sqrt(n) as the factors from 2 to sqrt(n)
    *  have multiples from sqrt(n)+1 to n. So, by iterating till sqrt(n) only, you can check if a number is prime.
    * Expected Time Complexity : O(N1/2)
    Expected Auxilliary Space :  O(1)
     */
    public static boolean isPrime(int N) {
        // code here
        if (N == 1)//1 is not prime so return false
            return false;

        for (int i = 2; i <= Math.sqrt(N); i++)////We check from 2 from sqrt(N) as divisors, if any, would exist till sqrt(N)
        {
            if (N % i == 0)//If any i divides the number this means the nubmer is not prime
                return false;
        }
        return true;//return true in other cases
    }

    /*
     *Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
     */
    /*
    *The logic behind this is, such numbers can have only three numbers as their divisor and also that include 1
    * and that number itself resulting into just a single divisor other than number, so we can easily conclude
    * that required are those numbers which are squares of prime numbers so that they can have only three divisors
    * (1, number itself and sqrt(number)). So all primes i, such that i*i is less than equal to N are three-prime numbers.
    *
    Now implementation can be better as the constrains are high. Find all the perfect squares less than
    * N (Ofcourse it is sqrt(N) ) and iterate over it to check if its prime or not using seive method in sqrt(i) time
    * (where 'i' is the number you checking prime for and it will be less than equal to sqrt(1e9) ).
    Complexity: sqrt(N)*sqrt(sqrt(N))
    Note: We can generate all primes within a set using any sieve method efficiently and then we should all primes i, suct that i*i <=N
    * Expected Time Complexity : O(N1/2 * N1/4)
       Expected Auxilliary Space :  O(1)
     */

    public static int exactly3Divisors(int N) {
        int counter = 0; //Initializing counter to zero
        N = (int) Math.sqrt(N);

        for (int i = 1; i <= N; i++) //Running a loop from 1 to N
        {
            // A number N only has 3 divisors if it is a perfect square and its square root is a prime number,
            //  and we know the number of perfect squares less than N which is sqrt(N),
            // so just checking if i is prime or not
            if (isPrime(i))
                counter++;
        }
        return counter;
    }

    //(a+b)%m = (a%m+b%m) % m
    /*
     *Given two numbers a and b, find the sum of a and b.
     * Since the sum can be very large, find the sum modulo 109+7.
     *  Expected Time Complexity : O(1)
    Expected Auxilliary Space :  O(1)
     */
    public static long sumUnderModulo(long a, long b) {
        // code here
        int M = 1000000007;
        //return sum modulo with M
        return (a % M + b % M) % M;
    }

    //(a*b)%m=((a%m)*(b%m))%m
    /*
     *You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).
     * Expected Time Complexity : O(1)
    Expected Auxilliary Space :  O(1)
     */
    static long multiplicationUnderModulo(long a, long b) {
        // add your code here
        int M = 1000000007;
        return ((a % M) * (b % M)) % M;

    }

    /*
    *Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’.
    a x ≡ 1 (mod m)
    The value of x should be in {0, 1, 2, … m-1}, i.e., in the ring of integer modulo m.
    The multiplicative inverse of “a modulo m” exists if and only if a and m are relatively prime (i.e., if gcd(a, m) = 1).
    * Expected Time Complexity : O(m)
    Expected Auxilliary Space : O(1)
     */
    public static int modInverse(int a, int m) {
        // taking mod of a with m
        a = a % m;

        // For every number x, check if (a*x)%m is 1
        for (int x = 1; x < m; x++)
            if ((a * x) % m == 1)
                return x;
        return -1;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println(modInverse(6, 34));
    }
}
