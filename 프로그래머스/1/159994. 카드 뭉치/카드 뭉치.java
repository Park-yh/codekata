class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;

        for (String word : goal) {
            if (cards1Index < cards1.length && word.equals(cards1[cards1Index])) {
                cards1Index++;
            } else if (cards2Index < cards2.length && word.equals(cards2[cards2Index])) {
                cards2Index++;
            } 
            else {
                return "No";
            }
        }

        return "Yes";
    }
}