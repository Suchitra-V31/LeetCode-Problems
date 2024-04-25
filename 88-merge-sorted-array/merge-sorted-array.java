class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            System.out.println(Arrays.toString(nums1));
        }
        else{
            int[] result = mergedArray(nums1,nums2,m,n);
            System.out.println(Arrays.toString(result));
        }
        
    }
    public static int[] mergedArray(int[] nums1,int[]nums2,int m,int n){
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
