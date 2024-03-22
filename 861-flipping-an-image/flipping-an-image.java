class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] l = new int[image.length][];
        int k=0;
        for(int[] i:image){
            int m=0;
            int[] l1=new int[i.length];
            for(int j=i.length-1;j>=0;j--){
                i[j] = (i[j]==0 )?1:0;
                l1[m]= i[j];
                m++;
            }
            System.out.println(Arrays.toString(l1));
            l[k]=l1;
            k++;
        }
        return l;
        
    }
}