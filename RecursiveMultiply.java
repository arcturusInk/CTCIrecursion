package com.company;

/*Write a recursive function to multiply two positive integers without
using the * operator.You can use addition, subtraction, and bit shifting,
but you should minimize the number of those operations. */

//Time Complexity: O()
public class RecursiveMultiply {

    public static int multiply(int x, int y){
        if( y == 1){
            return x;
        }
        if(y == 0){
            return 1;
        }

        return multiply(x, y - 1) + x;
    }

    public static void main(String[] args) {
        int x = 5, y = 3;
        //int x = 5, y = 10;
        //int x = 4, y = 4;
        System.out.print(multiply(x,y));
    }
}
