package com.company;

/* Compute the sum of natural numbers until N.*/

//Time Complexity: O(n)
public class sumOfNaturalNumbers {

    public static int sum(int n){
        if(n == 1){
            return n;
        }
        return sum(n-1) + n;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.print(sum(num));
    }
}
