package leetcode.easy.besttimetobuyandsellstock;
class Solution {
    public int maxProfit(int[] prices) {
    	
    	int minVal = prices[0];
    	int maxVal = 0;
    	int maxProfit = 0;

    	for(int i = 1;i<prices.length;i++) {
    		if (prices[i] > maxVal) {
    			maxVal = prices[i];
    		}
    		if(maxVal-minVal > maxProfit && maxVal != minVal) maxProfit = maxVal-minVal;
    		
    		if (prices[i] < minVal) {
    			minVal = prices[i];
    			maxVal = minVal;
    		}
    	}
    	
    	
    	return maxProfit;
    }
}