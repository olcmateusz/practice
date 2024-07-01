package leetcode.easy.validanagram;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        
    	if (s.length() != t.length()) return false;
    	
    	HashMap<Character, Integer> sMap = new HashMap<>();
    	HashMap<Character, Integer> tMap = new HashMap<>();
    	

    	for(int i = 0; i< s.length();i++) {
    		sMap.merge(s.charAt(i), 1, Integer::sum);
    		tMap.merge(t.charAt(i), 1, Integer::sum);
    	}
    	
    	for (Character letter : sMap.keySet()) {
			if(!tMap.containsKey(letter) || !tMap.get(letter).equals(sMap.get(letter))) {
				return false;
			}
		}
    	
    	return true;
    }
}