package com.company;

/*Use recursion to determine whether a word is a palindrome*/

//Time Complexity: O(n)
public class StringPalindrome {

    public static boolean isPalindrome (String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        if(s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length()-1)){
            return isPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        //String word = "motor";
        String word = "rotor";
        //String word = "Anna";

        if(isPalindrome(word)){
            System.out.print(word + " is a palindrome");
        }else{
            System.out.print(word + " is not a palindrome");
        }
    }
}
