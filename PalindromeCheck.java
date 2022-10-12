// cerner_2tothe5th_2022
package cerner.programmersDay.event;

public class PalindromeCheck {
    public boolean isPalindrome(String strToCheck)
    {
        // Initializing an empty string builder to store the reverse
        // of the original strToCheck
        StringBuilder reverseStr = new StringBuilder(strToCheck);
        System.out.println("Original String : " + strToCheck);

        // Initializing a new boolean variable for the
        // isPalindrome
        boolean isPalindrome = false;

        // Checking if both the strings are equal
        if (strToCheck.equals(reverseStr.reverse().toString())) {
            isPalindrome = true;
        }
        System.out.println("Reverse String : " + reverseStr);

        return isPalindrome;
    }
}
