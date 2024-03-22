class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n]; 
        
        for (int[] i : indices) {
            int a = i[0];
            int b = i[1];

            for (int k = 0; k < n; k++) {
                arr[a][k]++;
            }  

            for (int k = 0; k < m; k++) {
                arr[k][b]++;
            }
        }
        int count = 0;
        for (int[] g : arr) {
            for(int j=0;j<g.length;j++){
                if(g[j]%2!=0){
                    count++;
                }
                
            }
        }
        return count;

    }
}