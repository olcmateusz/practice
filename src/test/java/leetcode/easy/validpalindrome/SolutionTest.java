package leetcode.easy.validpalindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void shouldReturnTrue() {
		Solution solution = new Solution();
		String s = "racecar";
		assertTrue(solution.isPalindrome(s));
		
		s = "123321";
		assertTrue(solution.isPalindrome(s));
		
		s = "a121a";
		assertTrue(solution.isPalindrome(s));

		s = "A man, a plan, a canal: Panama";
		assertTrue(solution.isPalindrome(s));
		
	}
	
	@Test
	void shouldReturnFalse() {
		Solution solution = new Solution();
		String s = "Not Palindrome";
		
		assertFalse(solution.isPalindrome(s));
		s="123";
		assertFalse(solution.isPalindrome(s));
		s="1233421";
		assertFalse(solution.isPalindrome(s));
		
	}

}
