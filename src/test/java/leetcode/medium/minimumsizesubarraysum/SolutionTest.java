package leetcode.medium.minimumsizesubarraysum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

//	@Test
//	void initialWindowSliceTest() {
//		
//		Solution solution = new Solution();
//		
//		int target = 6;
//		int[] nums = {1,2,3,4};
//		
//		assertEquals(3, solution.minSubArrayLen(target, nums));
//		
//		target = 15;
//		int[] nums2 = {7,6,3,4};
//		
//		assertEquals(3, solution.minSubArrayLen(target, nums2));
//		
//		target = 13;
//		int[] nums3 = {7,2,3,4};
//		
//		assertEquals(4, solution.minSubArrayLen(target, nums3));
//	}
	
	@Test
	void shouldReturnZero() {
		Solution solution = new Solution();
		
		int target = 6;
		int[] nums = {1,1,1,1};
		
		assertEquals(0, solution.minSubArrayLen(target, nums));
	}
	
	@Test
	void testMinWindow() {
		Solution solution = new Solution();
		int target = 15;
		int[] nums = {1,2,3,4,5};
		
		assertEquals(5, solution.minSubArrayLen(target, nums));
		
		target = 7;
		int[] nums2 = {1,2,3,4};
		
		assertEquals(2, solution.minSubArrayLen(target, nums2));
		
		target = 3;
		int[] nums3 = {1,2,3,4};
		
		assertEquals(1, solution.minSubArrayLen(target, nums3));
	}

}
