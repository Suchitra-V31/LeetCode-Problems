class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n :nums){
            String s = String.valueOf(n);
            int len = s.length();
            if(len%2==0){
                count++;
            }
         }
         return count;
    }
}