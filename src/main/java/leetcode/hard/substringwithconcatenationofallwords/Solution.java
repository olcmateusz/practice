package leetcode.hard.substringwithconcatenationofallwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * You are given a string s and an array of strings words. All the strings of words are of the same length.

A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.

For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.

 

Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]

Output: [0,9]

Explanation:

The substring starting at 0 is "barfoo". It is the concatenation of ["bar","foo"] which is a permutation of words.
The substring starting at 9 is "foobar". It is the concatenation of ["foo","bar"] which is a permutation of words.

Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]

Output: []

Explanation:

There is no concatenated substring.

Example 3:

Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]

Output: [6,9,12]

Explanation:

The substring starting at 6 is "foobarthe". It is the concatenation of ["foo","bar","the"].
The substring starting at 9 is "barthefoo". It is the concatenation of ["bar","the","foo"].
The substring starting at 12 is "thefoobar". It is the concatenation of ["the","foo","bar"].
 */
class Solution{
    public List<Integer> findSubstring(String s, String[] words) {
    	
    	int wordLength = words[0].length();
    	int wordCount = words.length;
    	int windowSize = wordLength*wordCount;
    	
    	List<Integer> indexList = new ArrayList<>();
    	HashMap<String,Integer> occuranceMap = new HashMap<>();
    	
    	for(int i = 0; i< words.length; i++) {
    		occuranceMap.merge(words[i], 1, Integer::sum);
    	}
    	
    	HashMap<String,Integer> copy = new HashMap<>();
    	
    	for(int i=0;i<wordLength;i++) {
    		int leftPointer = i;
    		copy.putAll(occuranceMap);
    		for (int j = i; j <= s.length()-wordLength;j+=wordLength) {
    			String curentSubstring = s.substring(j, j+wordLength);
    			if(copy.containsKey(curentSubstring)) {
    				while(copy.get(curentSubstring) == 0 && leftPointer <= j) {
    					String mostLeftSubstring = s.substring(leftPointer,leftPointer+wordLength);
    					copy.put(mostLeftSubstring, copy.get(mostLeftSubstring) + 1);
    					leftPointer += wordLength;
    				}
    				copy.put(curentSubstring, copy.get(curentSubstring)-1);
    				if(copy.values().stream().mapToInt(Integer::intValue).sum() == 0 ){
    					indexList.add(leftPointer);
    				}
    			}else{
    				leftPointer = j + wordLength;
    				copy.putAll(occuranceMap);
    				continue;
    			}
    		}
    	}    	
    	return indexList;
    }
}

