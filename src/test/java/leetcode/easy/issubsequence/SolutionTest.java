package leetcode.easy.issubsequence;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturnTrue() {
		Solution solution = new Solution();
		String s = "ace";
		String t = "abcde";
		assertTrue(solution.isSubsequence(s, t));
	}
	
	@Test
	void shouldReturnFalse() {
		Solution solution = new Solution();
		String s = "ace";
		String t = "abcd";
		
		assertFalse(solution.isSubsequence(s, t));
	}

}
