package leetcode.easy.majorityelement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] testArray = {1,1,1,1,1,2,3,4,5};
		assertEquals(1, solution.majorityElement(testArray));
	}
	
	@Test
	void test2() {
		Solution solution = new Solution();
		int[] testArray = {2,3,3,3,3,1,1,1,4,5,6,7,8,9,1,2,1,1,1,2,3,4,5,6,7,8,9,1,1};
		assertEquals(1, solution.majorityElement(testArray));
	}

}
