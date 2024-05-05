package leetcode.easy.removeduplicatesfromsortedarray;
class Solution {
    public int removeDuplicates(int[] nums) {
    	
    	int countOfNumbers = 1;
    	
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i] != nums[i-1]) {
    			nums[countOfNumbers++] = nums[i];
    		}
    	}
    	
        return countOfNumbers;
    }
}