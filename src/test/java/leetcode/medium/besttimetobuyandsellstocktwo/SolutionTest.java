package leetcode.medium.besttimetobuyandsellstocktwo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		
		int[] testArray = {7,1,5,3,6,4};
		
		assertEquals(7, solution.maxProfit(testArray));
	}

}
