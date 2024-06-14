package leetcode.medium.containerwithmostwater;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		assertEquals(49, solution.maxArea(height));
	}

}
