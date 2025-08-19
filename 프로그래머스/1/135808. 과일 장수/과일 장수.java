import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int maxProfit = 0;

        Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Collections.reverseOrder());

        if (scores.length >= m) {
            for (int i = m - 1; i < scores.length; i += m) {
                int minScoreInBox = scores[i];
                maxProfit += minScoreInBox * m;
            }
        }
        
        return maxProfit;
    }
}