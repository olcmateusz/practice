package leetcode.easy.removeelement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] testArray = {1,1,2,2,5,0,-7,3,2};
		int[] resultArray = {1,1,5,0,-7,3,-7,3,2};
		
		int removedVal = 2;
		
		assertEquals(6, solution.removeElement(testArray, removedVal));
		
	}

}
