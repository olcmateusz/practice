package leetcode.medium.numberofwonderfulstrings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public long wonderfulSubstrings(String word) {
    
    	
    	long wonderfulSubstringsCount = 0;
    	
    	
    	
    	
    	for(int i = 0; i < word.length();i++) {
    		Map<Character, Integer> letters = new HashMap<>();
    		for(int j=i; j<word.length();j++) {
    			Character character = word.charAt(j);
    			if (letters.containsKey(character)) {
    				letters.put(character, (letters.get(character) + 1) % 2);

    			}else {
    				letters.put(character, 1);
    			}
    			
    			if(letters.values().stream().reduce(0, (a,b) -> a + b) <= 1) {
    				wonderfulSubstringsCount++;
    			}
    			    		
    		}
    		
    		
    	}
    	
        return wonderfulSubstringsCount;
    }
}