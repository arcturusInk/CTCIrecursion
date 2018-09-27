package com.company;

/* Find Greatest Common Divisor (GCD) of 2 numbers using recursion*/

//Time Complexity: O()
public class GreatestCommonDivisor {

    public static int GCD(int x, int y){
        if(x % y == 0){
            return y;
        }
        return GCD(x, x % y);
    }

    public static void main(String[] args) {
        int s = 10, b = 15;
        //int s = 9, b = 18;
        //int s = 20, b = 30;

        int x , y;

        if(s > b){
            x = s;
            y = b;
        }else{
            x = b;
            y = s;
        }

        System.out.println(GCD(x,y));
    }
}
