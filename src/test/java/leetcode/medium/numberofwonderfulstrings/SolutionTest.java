package leetcode.medium.numberofwonderfulstrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testWonderfulStrings() {
		Solution solution = new Solution();
		
//		assertEquals(2, solution.wonderfulSubstrings("a"));
		
		
		assertEquals(4l, solution.wonderfulSubstrings("aba"));
		assertEquals(9l, solution.wonderfulSubstrings("aabb"));
		assertEquals(2l, solution.wonderfulSubstrings("he"));
	}

}
