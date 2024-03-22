class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        List<Integer> l = new ArrayList<>();
        for(int[] i:accounts){
            for(int j=0;j<i.length;j++){
                s+=i[j];
            }
            //System.out.println(s);
            l.add(s);
            s=0;
        }
        return Collections.max(l);
        
    }
}