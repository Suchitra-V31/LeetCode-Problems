class Solution {
    public String restoreString(String s, int[] indices) {
        char [] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]] = s.charAt(i);
        }
        String r ="";
        for(char i : arr){
            r+=i;
        }
        return r;
        
    }
}