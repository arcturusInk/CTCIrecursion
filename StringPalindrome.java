package com.company;

/*Use recursion to determine whether a word is a palindrome*/

//Time Complexity: O(n)
public class StringPalindrome {

    //using recursion
    public static boolean isPalindrome (String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        if(s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

    //solving using the iterative method
    public static boolean isPal(String s){
        for(int i = 0; i < s.length()/2; ++i){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //String word = "motor";
        String word = "rotor";
        //String word = "Anna";

        if(isPalindrome(word) && isPal(word)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
