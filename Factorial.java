package com.company;

/*Find the factorial of the integer*/

//Time Complexity: O(n)
public class Factorial {

    public static int factorial(int n){
        if (n <= 1){
            return n;
        }
        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        int fact = 4;
        System.out.print(factorial(fact));
    }
}
