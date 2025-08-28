class Solution {
    public int solution(String s) {
        int splitCount = 0;
        int index = 0;

        while (index < s.length()) {
            splitCount++;
            char firstChar = s.charAt(index);
            
            int sameCount = 0;
            int diffCount = 0;
            
            for (; index < s.length(); index++) {
                if (s.charAt(index) == firstChar) {
                    sameCount++;
                } else {
                    diffCount++;
                }

                if (sameCount == diffCount) {
                    index++;
                    break;
                }
            }
        }

        return splitCount;
    }
}