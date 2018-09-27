package com.company;

/*
Write a recursive function to reverse the words in a string,
i.e., ”cat is running” becomes ”running is cat”.
Also write a recursive function to reverse the characters
in a string. i.e., "Sad" becomes "daS."
 */


public class ReverseString {

    //Time Complexity: O(n^2)
    public static String reverseString (String s){
        if(s.lastIndexOf(" ") == -1){
            return s;
        }
        //getting the last word in the substring
        String subStr = s.substring(s.lastIndexOf(" ") + 1);
        //shortening the original string until it reaches the last word
        String lastWord = reverseString(s.substring(0, s.lastIndexOf(" ")));
        return subStr + " " + lastWord;
    }

    //Time Complexity: O(n)
    public static String reverseWord(String s){
        if(s.length() <= 1){
            return s;
        }
        return reverseWord(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "cat is running";
        //String str = "this is not working";
        //String str = "I am coding";

        System.out.println(reverseString(str));

        String word = "Mouse";
        //String word = "Blind";

        System.out.println(reverseWord(word));
    }
}
