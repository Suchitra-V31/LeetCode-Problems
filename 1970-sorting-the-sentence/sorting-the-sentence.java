class Solution {
    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        String[] r = new String[words.length];
        for(String i:words){   
            int n = Character.getNumericValue(i.charAt(i.length()-1)-1);
            r[n] = i.substring(0,i.length()-1);
        }
        String result =String.join(" ",r);
        return result;
        
    }
}