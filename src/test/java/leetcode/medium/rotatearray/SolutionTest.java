package leetcode.medium.rotatearray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int[] testArray =  {1,2,3,4,5,6,7,8,9};		
		int[] resultArray= {7,8,9,1,2,3,4,5,6};
		
		assertEquals(1, 11/10);
		
		
		solution.rotate(testArray, 3);
		
		assertArrayEquals(resultArray, testArray);
	}
	@Test
	void test2() {
		int[] testArray =  {1,2,3,4,5,6,7,8,9};
		assertEquals(1, 11/10);
	}
	@Test
	void test3() {
		int[] testArray =  {1,2,3,4,5,6,7,8,9};
		assertEquals(9, testArray.length);
	}
	@Test
	void test4() {
		Solution solution = new Solution();
		int[] testArray =  {1,2,3,4,5,6,7};
		int[] resultArray ={5,6,7,1,2,3,4};
		
		solution.rotate(testArray, 3);
		
		assertArrayEquals(resultArray, testArray);
	}

}
