class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr); // 1 3 5
        int d=arr[1]-arr[0]; // 3-1 = 2
        for (int i =1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]!=d)  
            {
            return false;
            }
        }
        return true;
    }

}