import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                scores[0]++;
            }
            if (answers[i] == student2[i % student2.length]) {
                scores[1]++;
            }
            if (answers[i] == student3[i % student3.length]) {
                scores[2]++;
            }
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> topScorers = new ArrayList<>();
        if (scores[0] == maxScore) {
            topScorers.add(1);
        }
        if (scores[1] == maxScore) {
            topScorers.add(2);
        }
        if (scores[2] == maxScore) {
            topScorers.add(3);
        }

        int[] answer = new int[topScorers.size()];
        for (int i = 0; i < topScorers.size(); i++) {
            answer[i] = topScorers.get(i);
        }

        return answer;
    }
}