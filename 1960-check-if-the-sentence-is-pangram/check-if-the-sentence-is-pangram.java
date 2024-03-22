class Solution {
    public boolean checkIfPangram(String s) {
        int count = 0;
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";

        for (int i = 0; i < alphabet.length(); i++) {
            if (s.contains(String.valueOf(alphabet.charAt(i)))) {
                count++;
            }
        }
        
        return count >= 26;
    }
}