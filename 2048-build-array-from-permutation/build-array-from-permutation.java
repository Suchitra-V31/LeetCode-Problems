class Solution {
    public int[] buildArray(int[] nums) {
		int l = nums.length;
		int arr[] = new int[l];
		int j=0;
        for(int i=0;i<nums.length;i++) {
        	arr[j]= nums[nums[i]];
        	j++;
        }
        return arr;
        
    }
}