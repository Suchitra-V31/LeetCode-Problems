class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length;
        int c =mat[0].length;
        int sum =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
            }
        }
        //System.out.println(sum);

        int k=0;
        while(r>=0 && k<c){
            if((r-1)!=k){
                //System.out.println(mat[r-1][k]);
                sum+=mat[r-1][k];
                //System.out.println("r : " +(r-1));
                //System.out.println("k : " +k);
            }
            r--;
            k++;
        }
        return sum;
    }
}