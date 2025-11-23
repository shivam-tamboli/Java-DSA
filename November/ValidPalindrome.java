/*
LeetCode

A phrase is a palindrome if, after converting all uppercase letters into lowercase 
letters and removing all non-alphanumeric characters, it reads the same forward 
and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example : 
Input : s = "abba";
Output : true
*/

import java.util.*;

public class ValidPalindrome {

    /*
      Time Complexity  : O(n)
      Space Complexity : O(1)
    */

    public static boolean isPalindrome(String s) {

        int left = 0;                         // initialize left pointer
        int right = s.length() - 1;           // initialize right pointer

        while (left < right) {                // loop until both pointers meet

            // skip non-alphanumeric characters from the left side
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // skip non-alphanumeric characters from the right side
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "amanaplanacanalpanama";

        System.out.println(isPalindrome(s));
    }
}

/*
Input :  "amanaplanacanalpanama"
Output : true
*/
