package leetcode.easy.summaryranges;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		
		int[] nums = {0,1,2,4,5,7};
		List<String> expected = Arrays.asList("0->2","4->5","7");
	
		assertEquals(expected, solution.summaryRanges(nums));
		
	}
	@Test
	void test2() {
		Solution solution = new Solution();
		
		int[] nums = {0,1,2,4,5,6,7};
		List<String> expected = Arrays.asList("0->2","4->7");
	
		assertEquals(expected, solution.summaryRanges(nums));
		
	}
	@Test
	void test3() {
		Solution solution = new Solution();
		
		int[] nums = {0,1,2,4,5,7,8};
		List<String> expected = Arrays.asList("0->2","4->5","7->8");
	
		assertEquals(expected, solution.summaryRanges(nums));
		
	}
	@Test
	void test4() {
		Solution solution = new Solution();
		
		int[] nums = {0,2,3,4,6,8,9};
		List<String> expected = Arrays.asList("0","2->4","6","8->9");
	
		assertEquals(expected, solution.summaryRanges(nums));
		
	}
	@Test
	void test5() {
		Solution solution = new Solution();
		
		int[] nums = {1,3};
		List<String> expected = Arrays.asList("1","3");
	
		assertEquals(expected, solution.summaryRanges(nums));
		
	}

}
