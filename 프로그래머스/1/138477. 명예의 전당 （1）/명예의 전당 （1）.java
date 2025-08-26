import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] hallOfFameScores = new int[score.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if (pq.size() > k) {
                pq.poll();
            }
            hallOfFameScores[i] = pq.peek();
        }
        
        return hallOfFameScores;
    }
}