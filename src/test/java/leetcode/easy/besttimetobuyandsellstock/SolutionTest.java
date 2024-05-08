package leetcode.easy.besttimetobuyandsellstock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		
		int[] testArray = {1,4,5,6,2};
		assertEquals(5, solution.maxProfit(testArray));
	}
	
	@Test
	void test2() {
		Solution solution = new Solution();
		
		int[] testArray = {2,4,5,6,1};
		assertEquals(4, solution.maxProfit(testArray));
	}
	@Test
	void test3() {
		Solution solution = new Solution();
		
		int[] testArray = {2,4,1};
		assertEquals(2, solution.maxProfit(testArray));
	}

}
