import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minClicks = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);
                int clicks = i + 1;

                minClicks.put(ch, Math.min(minClicks.getOrDefault(ch, Integer.MAX_VALUE), clicks));
            }
        }

        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalClicks = 0;
            boolean possible = true;

            for (char ch : target.toCharArray()) {
                if (minClicks.containsKey(ch)) {
                    totalClicks += minClicks.get(ch);
                } else {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                result[i] = totalClicks;
            } else {
                result[i] = -1;
            }
        }

        return result;
    }
}