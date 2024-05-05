package leetcode.easy.mergesortedarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testEmptyArray() {
		Solution solution = new Solution();
		int[] resultArray = {1,1,2,2,3,3,4};
		int[] testArray = {1,2,3,4,0,0,0};
		int[] testArray2 = {1,2,3};
		solution.merge(testArray, 4, testArray2, 3);
				
		assertArrayEquals(resultArray, testArray);
	}
	

}
