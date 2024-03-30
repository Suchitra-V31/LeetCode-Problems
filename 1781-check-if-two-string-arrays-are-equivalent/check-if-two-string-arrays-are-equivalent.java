class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder  a=new StringBuilder();
        StringBuilder  b=new StringBuilder();
        for(String i : word1){
            a.append(i);
        }
        for(String i : word2){
            b.append(i);
        }
        return (a.toString().equals(b.toString()));
        
    }
}