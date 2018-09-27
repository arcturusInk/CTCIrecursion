package com.company;

/*Computing powers of a number using recursion.
Write a recursive function that allows raising to a negative integer power as well.
 */

//Time Complexity: O(n)
public class Powers {

    public static int powers(int number, int pow){
        if(pow == 0){
            return 1;
        }
        if(pow == 1){
            return number;
        }
        return powers(number, pow-1) * number;
    }

    public static double negativePower(int num, int exponent){
        if(exponent == -1){
            return (1.0/num);
        }
        return negativePower(num, exponent + 1) * (1.0/num);
    }

    public static void main(String[] args) {
        int number = 4, pow = 3;
        //int number = 5, pow = 5;
        System.out.println(powers(number,pow));

        //int num = 2, exponent = -3;
        int num = 4, exponent = -2;
        System.out.println(negativePower(num, exponent));
    }
}
