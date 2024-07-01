package leetcode.easy.ransomnote;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		String ransomNote = "a";
		String magazine = "b";
		
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}
	
	@Test
	void test2() {
		Solution solution = new Solution();
		String ransomNote = "aa";
		String magazine = "ab";
		
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}
	
	@Test
	void test3() {
		Solution solution = new Solution();
		String ransomNote = "aa";
		String magazine = "aab";
		
		assertTrue(solution.canConstruct(ransomNote, magazine));
	}

}
