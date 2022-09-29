/**
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 *
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */

public class PalindromicSubstring {

    public int countSubstrings(String s) {
        if (s.isEmpty())
            return 0;

        int count = 0;
        for (int i=0; i<s.length(); i++)
        {
            count += countPalindrome(s, i, i); // odd lengths
            count += countPalindrome(s, i, i+1); // even lengths
        }

        return count;
    }

    private int countPalindrome(String s, int i, int j)
    {
        int count = 0;
        while (i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j))
        {
            ++count;
            --i;
            ++j;
        }

        return count;
    }

}
