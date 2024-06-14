package leetcode.medium.hindex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] testArray = {3,0,6,1,5};
		
		assertEquals(3, solution.hIndex(testArray));
	}
	@Test
	void test2() {
		Solution solution = new Solution();
		int[] testArray = {1,4,1};
		
		assertEquals(1, solution.hIndex(testArray));
	}
	void test3() {
		Solution solution = new Solution();
		int[] testArray = {1,2};
		
		assertEquals(1, solution.hIndex(testArray));
	}
	
	void test4() {
		Solution solution = new Solution();
		int[] testArray = {0,1};
		
		assertEquals(1, solution.hIndex(testArray));
	}
	void test5() {
		Solution solution = new Solution();
		int[] testArray = {100};
		
		assertEquals(1, solution.hIndex(testArray));
	}
	void test6() {
		Solution solution = new Solution();
		int[] testArray = {1};
		
		assertEquals(1, solution.hIndex(testArray));
	}
}
