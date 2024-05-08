package leetcode.medium.jumpgame;
class Solution {
    public boolean canJump(int[] nums) {
    	
    	boolean maxReached = false;
    	int maxJump = nums[0];
    	
    	if (nums.length == 1) return true;
    	if(maxJump == 0) return false;

    	for(int i=1;i<nums.length;i++) {
    		maxJump--;
    		if(i + maxJump >=nums.length-1) return true;
    		if(nums[i] > maxJump) maxJump = nums[i];
    		if (maxJump == 0) return false;
    	}
    	
        return maxReached;
    }
}