package leetcode.medium.containerwithmostwater;
class Solution {
    public int maxArea(int[] height) {
    	int lPointer = 0;
    	int rPointer = height.length-1;
    	int positionDifference = rPointer;
    	int maxArea = 0;
    	int currentArea = 0;
    	
    	while(lPointer<rPointer) {
    		currentArea = positionDifference * Math.min(height[lPointer], height[rPointer]);
    		if (currentArea > maxArea) maxArea = currentArea;
    		if(height[lPointer] > height[rPointer]) {
    			rPointer--;
    		}else {
    			lPointer++;
    		}
    		positionDifference--;
    		
    	}
        return maxArea;
    }
}