package leetcode.easy.removeduplicatesfromsortedarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] nums = {1,1,2,3,4,5,6,7};
		Solution solution = new Solution();
		assertEquals(7, solution.removeDuplicates(nums));
	}
	
	

}
