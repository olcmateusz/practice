package leetcode.easy.wordpattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturnTrue() {

		Solution solution = new Solution();
		
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		assertTrue(solution.wordPattern(pattern, s));
	}

	
	@Test
	void shouldReturnFalse() {

		Solution solution = new Solution();
		
		String pattern = "abba";
		String s = "dog cat cat fish";
		
		assertFalse(solution.wordPattern(pattern, s));
		
		pattern = "aaaa";
		s = "dog cat cat dog";
		
		assertFalse(solution.wordPattern(pattern, s));
		
	}
}
