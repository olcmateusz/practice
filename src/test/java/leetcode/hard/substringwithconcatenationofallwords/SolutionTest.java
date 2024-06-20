package leetcode.hard.substringwithconcatenationofallwords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList(0,9));

		
		String s ="barfoothefoobarman";
		String[] words = {"foo","bar"};
		
		assertEquals(expected, solution.findSubstring(s, words));
		
	}
	@Test
	void test2() {
		Solution solution = new Solution();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList());

		
		String s ="wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","word"};
		
		assertEquals(expected, solution.findSubstring(s, words));
		
	}
	@Test
	void test3() {
		Solution solution = new Solution();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList(6,9,12));

		
		String s ="barfoofoobarthefoobarman";
		String[] words = {"bar","foo","the"};
		
		assertEquals(expected, solution.findSubstring(s, words));
		
	}
	@Test
	void test4() {
		Solution solution = new Solution();
		
		List<Integer> expected = new ArrayList<>(Arrays.asList(8));

		
		String s ="wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","good"};
		
		assertEquals(expected, solution.findSubstring(s, words));
		
	}

}
