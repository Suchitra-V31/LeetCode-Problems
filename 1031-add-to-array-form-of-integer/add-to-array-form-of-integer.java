class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();    
        if(num.length < (k+"").length()) {
            String s = "";
            for(int i = 0; i < num.length; s += num[i++]+"");
            String[] str = (Integer.parseInt(s)+k+"").split("");
            for(int i = 0; i < str.length; list.add(Integer.parseInt(str[i++])));
        }
        else {
        for(int i = num.length-1; i >= 0; i--) {
            num[i] = num[i]+k%10;
            k /= 10;
            if(num[i] > 9 && i != 0) {
                num[i-1] += num[i]/10;;
                num[i] = num[i]%10;
            }
        }
        for(int i = 0; i < num.length; i++) {
            if(num[i] > 9) {
                list.add(Integer.parseInt((num[i]+"").charAt(0)+""));
                list.add(Integer.parseInt((num[i]+"").charAt(1)+""));
            }
            else list.add(num[i]);
        }
        }
        return list;
    }
}