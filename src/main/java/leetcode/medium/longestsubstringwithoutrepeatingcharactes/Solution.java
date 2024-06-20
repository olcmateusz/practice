package leetcode.medium.longestsubstringwithoutrepeatingcharactes;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {

    	if (s.length() <= 1) return 1;
    	
    	int maxLength = 0;
    	int leftPointer = 0;
    	HashSet<Character> substringChars = new HashSet<>();
    	
    	for (int i=0;i<s.length();i++) {
    		while(substringChars.contains(s.charAt(i))) {
    			substringChars.remove(s.charAt(leftPointer));
    			leftPointer++;
    		}
    		substringChars.add(s.charAt(i));
    		maxLength = Math.max(maxLength, i-leftPointer+1);
    	}
        return maxLength;
    }
}