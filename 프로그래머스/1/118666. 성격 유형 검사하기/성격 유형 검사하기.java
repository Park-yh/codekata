import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char type : types) {
            scores.put(type, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];

            if (choice == 4) {
                continue;
            }

            int score = Math.abs(4 - choice);
            
            if (choice < 4) {
                char type = survey[i].charAt(0);
                scores.put(type, scores.get(type) + score);
            } else {
                char type = survey[i].charAt(1);
                scores.put(type, scores.get(type) + score);
            }
        }

        StringBuilder result = new StringBuilder();
        
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');
        
        return result.toString();
    }
}