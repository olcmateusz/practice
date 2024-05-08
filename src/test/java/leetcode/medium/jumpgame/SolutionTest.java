package leetcode.medium.jumpgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturnTrue() {
		Solution solution = new Solution();
		
		int[] testArray = {2,3,1,1,4};
		
		assertTrue(solution.canJump(testArray));
	}
	
	@Test
	void shouldReturnFalse() {
		Solution solution = new Solution();
		
		int[] testArray = {3,2,1,0,4};
		
		assertFalse(solution.canJump(testArray));
		int[] testArrayTwo = {0,2,3};
		
		assertFalse(solution.canJump(testArrayTwo));
	}

}
