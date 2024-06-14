package leetcode.medium.twosumII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] numbers = {2,7,11,15};
		int target = 9;
		
		assertArrayEquals(new int[] {1,2}, solution.twoSum(numbers, target));
		
		int[] numbers2 = {2,3,4};
		target = 6;
		
		assertArrayEquals(new int[] {1,3}, solution.twoSum(numbers2, target));
		
		int[] numbers3 = {0,0,3,4};
		target = 0;
		
		assertArrayEquals(new int[] {1,2}, solution.twoSum(numbers3, target));
	}

}
