package leetcode.easy.isomorphicstrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturnTrue() {
		Solution solution = new Solution();
		
		String s = "egg";
		String t = "add";
		
		assertTrue(solution.isIsomorphic(s, t));
		
		s = "paper";
		t = "title";
		
		assertTrue(solution.isIsomorphic(s, t));
		
	}
	
	@Test
	void shouldReturnFalse() {
		Solution solution = new Solution();
		
		String s = "foo";
		String t = "bar";
		
		assertFalse(solution.isIsomorphic(s, t));
	}

}
