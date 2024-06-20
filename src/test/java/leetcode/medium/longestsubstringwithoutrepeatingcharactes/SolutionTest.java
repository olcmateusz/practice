package leetcode.medium.longestsubstringwithoutrepeatingcharactes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		String s = "wkwb";
		
		assertEquals(3,solution.lengthOfLongestSubstring(s));
		
		s = "bbbbb";
		assertEquals(1,solution.lengthOfLongestSubstring(s));
		s = "pwwkew";
		assertEquals(3,solution.lengthOfLongestSubstring(s));
		s = "abcabcbb";
		assertEquals(3,solution.lengthOfLongestSubstring(s));
		
		s="abcabef";
		assertEquals(5,solution.lengthOfLongestSubstring(s));
		
	}

}
