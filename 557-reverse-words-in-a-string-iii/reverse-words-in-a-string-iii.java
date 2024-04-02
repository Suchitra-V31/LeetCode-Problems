class Solution {
    public String reverseWords(String s) {
        String r="";
        String[] l = s.split(" ");
        //System.out.println(Arrays.toString(l));
        for(String i : l){
            StringBuilder n = new StringBuilder(i);
            r = r+ n.reverse()+" ";
        }
        return r.trim();
    }
}