package leetcode.easy.summaryranges;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.
 */

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<String>();
        
        if(nums.length == 1) {
        	ranges.add(String.valueOf(nums[0]));
        	return ranges;
        }
        
        int helper = 0;
        
        for(int i = 1; i< nums.length;i++) {
        	if(nums[i] - 1 != nums[i-1]) {
        		if(i==1 && nums.length > 2) {
        			ranges.add(String.valueOf(nums[0]));
        			helper = i;
        			continue;
        		}
        		if(i - helper > 1) {
        			ranges.add(String.valueOf(nums[helper]) + "->" + String.valueOf(nums[i-1]));
        		}else {
        			ranges.add(String.valueOf(nums[i-1]));
        		}
        		helper = i;
        		if(nums.length-1 == i) ranges.add(String.valueOf(nums[i]));
        	}else if(nums.length-1 == i) ranges.add(String.valueOf(nums[helper]) + "->" + String.valueOf(nums[i]));
        	
        }
        
        return ranges;
    }
}