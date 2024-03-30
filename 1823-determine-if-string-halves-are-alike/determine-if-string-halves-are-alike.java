class Solution {
    public boolean halvesAreAlike(String s) {
       List<String> vowels = Arrays.asList("a","e","i","o","u");
       int c1 =0;
       int c2=0;
       String a = s.substring(0,s.length()/2);
       String b = s.substring(s.length()/2);
       for(char i : a.toCharArray()){
           if(vowels.contains(Character.toString(Character.toLowerCase(i)))){
               c1+=1;
           }
       }
        for(char i : b.toCharArray()){
           if(vowels.contains(Character.toString(Character.toLowerCase(i)))){
               c2+=1;
           }
       }
       System.out.println(c1==c2); 
       return c1==c2;
    }
}

        
    
