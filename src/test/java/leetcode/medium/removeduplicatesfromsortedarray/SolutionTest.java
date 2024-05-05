package leetcode.medium.removeduplicatesfromsortedarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
	

	@Test
	void test() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1,2,2,3};
		
		assertEquals(5, solution.removeDuplicates(testArray));
	}
	
	@Test
	void test2() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1,1,2,2,3};
		
		assertEquals(5, solution.removeDuplicates(testArray));
	}
	@Test
	void test3() {
		Solution solution = new Solution();
		int testArray[] = {0,0,1,1,1,1,2,3,3};
		
		assertEquals(7, solution.removeDuplicates(testArray));
	}
	@Test
	void test4() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1};
		
		assertEquals(2, solution.removeDuplicates(testArray));
	}
	@Test
	void test5() {
		Solution solution = new Solution();
		int testArray[] = {1,1,2};
		
		assertEquals(3, solution.removeDuplicates(testArray));
	}
	@Test
	void test6() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1,1};
		
		assertEquals(2, solution.removeDuplicates(testArray));
	}

	@Test
	void test7() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1,2};
		
		assertEquals(3, solution.removeDuplicates(testArray));
	}
	@Test
	void test8() {
		Solution solution = new Solution();
		int testArray[] = {1,1,1,2,2,2,3,3};
		
		assertEquals(6, solution.removeDuplicates(testArray));
	}
	@Test
	void testFinal() {
		Solution solution = new Solution();
		int testArray[] = {-3,-1,-1,0,0,0,0,0};
		
		assertEquals(5, solution.removeDuplicates(testArray));
	}
	@Test
	void testFinal2() {
		Solution solution = new Solution();
		int testArray[] = {-3,-1,-1,0,0,0,0};
		
		assertEquals(5, solution.removeDuplicates(testArray));
	}
}
