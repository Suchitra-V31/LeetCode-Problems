class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
                 int count = 0;
         int[] result = new int[nums.length];
         int k=0;
         for(int i=0;i<nums.length;i++){ 
            for(int j=0;j<nums.length;j++){ 
                if(nums[i]>nums[j] && j!=i){
                    count+=1;
                }
             }
             result[k]=count;
             k++;
             count=0;
         }
        return result;
        
    }
}