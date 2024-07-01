package leetcode.easy.ransomnote;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	
    	HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
    	
    	for(int i=0;i<ransomNote.length();i++) {
    		ransomNoteMap.merge(ransomNote.charAt(i), 1, Integer::sum);
    	}
    	
    	HashMap<Character, Integer> magazineMap = new HashMap<>();
    	
    	for(int i= 0; i<magazine.length();i++) {
    		magazineMap.merge(magazine.charAt(i), 1, Integer::sum);
    	}
    	
    	for (Character key : ransomNoteMap.keySet()) {
    		if (!magazineMap.containsKey(key) || magazineMap.get(key) < ransomNoteMap.get(key)) {
    			return false;
    		}
    	}
    	
    	
    	return true;
        
    }
}