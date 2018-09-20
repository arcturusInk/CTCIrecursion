package com.company;

/*Write a method to generate the nth Fibonacci number.*/

//Time Complexity: O(2^n)
public class Fibonacci {

    //longer version
    public static int generateFibonacciNumber(int position){
        if (position == 0){
            return 0;
        }else if(position ==  1){
            return 1;
        }
        int a = generateFibonacciNumber(position-1);
        int b = generateFibonacciNumber(position - 2);
        return a + b;
    }

    //shorter version
    public static int genFibNum (int pos){
        if( pos <= 1){
            return pos;
        }
        return genFibNum(pos - 1) + genFibNum( pos - 2);
    }

    public static void main(String[] args) {
        System.out.println(generateFibonacciNumber(4));
        System.out.println(genFibNum(4));
    }
}
