package com.company;

/*Computing powers of a number using recursion*/

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

    public static void main(String[] args) {
        int number = 4, pow = 3;
        //int number = 5, pow = 5;
        System.out.print(powers(number,pow));
    }
}
