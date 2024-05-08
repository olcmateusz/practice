package leetcode.medium.jumpgametwo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SolutionTest {

	@Test
	void shouldReturnTwo() {
		Solution solution = new Solution();
		int[] testArrayTwo = {2,3,0,1,4};
		int[] testArray = {2,3,1,1,4};

		assertEquals(2, solution.jump(testArrayTwo));
		assertEquals(2, solution.jump(testArray));
	}
	@Test
	void shouldReturnOne() {
		Solution solution = new Solution();
		int[] testArrayTwo = {3,2,0,1};
		int[] testArray = {5,3,1,1,4};

		assertEquals(1, solution.jump(testArrayTwo));
		assertEquals(1, solution.jump(testArray));
	}
	@Test
	void shouldReturnThree() {
		Solution solution = new Solution();
		int[] testArrayTwo = {2,1,2,1,4,5};
		int[] testArray = {2,1,2,0,1,7};
		int[] testArrayThree = {9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};

		assertEquals(3, solution.jump(testArrayThree));
		assertEquals(3, solution.jump(testArrayTwo));
		assertEquals(3, solution.jump(testArray));
	}
	@Test
	void shouldReturnFour() {
		Solution solution = new Solution();
		int[] testArrayTwo = {2,1,2,1,4,5};
		int[] testArray = {1,1,1,1,1};

//		assertEquals(4, solution.jump(testArrayTwo));
		assertEquals(4, solution.jump(testArray));
	}
}
