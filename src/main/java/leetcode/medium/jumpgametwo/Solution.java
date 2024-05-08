package leetcode.medium.jumpgametwo;
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
    	int maxJump = nums[0];
    	int currentIndex = 0;
    	int currentJumpGain;
    	int maxJumpGain = 0;
    	int maxJumpGainIndex= 0;
    	
    	if (nums.length == 1) return 0;
    	if (maxJump >= nums.length-1) return 1;
    	
        for(int i=1; i< nums.length; i++) {
        	if(i + nums[i] >= nums.length-1) {
        		jumps +=2;
        		return jumps;
        	}
        	currentJumpGain = maxJump - (maxJump-i) + nums[i];
        	if(maxJumpGain < currentJumpGain) {
        		maxJumpGain = currentJumpGain;
        		maxJumpGainIndex = i;
        	}
        	if(currentIndex + maxJump - i <= 0) {
        		maxJump = nums[maxJumpGainIndex];
        		currentIndex = maxJumpGainIndex;
        		maxJumpGain = 0;
        		jumps++;
        		
        	}
        }
        
    	return jumps;
    }
}