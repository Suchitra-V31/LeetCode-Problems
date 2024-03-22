import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int max= Arrays.stream(candies).max().getAsInt(); 
        for(int i:candies){
            int n = i+extraCandies;
            l.add(n>=max);
        }      
        return l;
    }
}
