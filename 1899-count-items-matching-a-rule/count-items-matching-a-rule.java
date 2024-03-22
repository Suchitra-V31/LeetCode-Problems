import java.util.List;

class Solution {
    public static int findCount(List<List<String>> items, String ruleValue, int attributeIndex) {
        int count = 0;
        for (List<String> item : items) {
            String attributeValue = item.get(attributeIndex);
            if (attributeValue.equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int attributeIndex = -1;

        switch (ruleKey) {
            case "type":
                attributeIndex = 0;
                break;
            case "color":
                attributeIndex = 1;
                break;
            case "name":
                attributeIndex = 2;
                break;
            default:
                break;
        }

        if (attributeIndex != -1) {
            return findCount(items, ruleValue, attributeIndex);
        }

        return 0; 
    }
}
