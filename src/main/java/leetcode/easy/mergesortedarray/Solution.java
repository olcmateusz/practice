package leetcode.easy.mergesortedarray;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	m--;
    	n--;
    	int lastElement = nums1.length-1;   	
    	
    	for (int i=lastElement; i>=0;i--) {
    		if(m<0 || n<0) {
    			nums1[i] = m<0 ? nums2[n--] : nums1[m--];
    			continue;
    		}

    		if(nums1[m] >= nums2[n]) {
    			nums1[i] = nums1[m];
    			m--;
    		}else {
    			nums1[i] = nums2[n];
    			n--;
    		}
    		
    	}
    	
    }
}