package leetcode.easy.wordpattern;

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
    	String[] words = s.split(" ");
    	
    	if(pattern.length() != words.length) return false;
    	
    	HashMap<Character, String> map = new HashMap<>();
    	
    	for(int i = 0; i< pattern.length();i++) {
    		if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(words[i]) || 
    				!map.containsKey(pattern.charAt(i)) && map.values().contains(words[i])) {    			
    			return false;
    		}
    		
    		map.put(pattern.charAt(i), words[i]);
    	}
    	
    	return true;
    }
}