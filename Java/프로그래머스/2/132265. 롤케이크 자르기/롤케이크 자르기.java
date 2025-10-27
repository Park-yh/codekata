import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;
        Set<Integer> leftPiece = new HashSet<>();
        Map<Integer, Integer> rightPiece = new HashMap<>();

        for (int t : topping) {
            rightPiece.put(t, rightPiece.getOrDefault(t, 0) + 1);
        }

        for (int i = 0; i < n - 1; i++) {
            int currentTopping = topping[i];

            leftPiece.add(currentTopping);

            int count = rightPiece.get(currentTopping) - 1;
            
            if (count == 0) {
                rightPiece.remove(currentTopping);
            } else {
                rightPiece.put(currentTopping, count);
            }
            if (leftPiece.size() == rightPiece.size()) {
                answer++;
            }
        }

        return answer;
    }
}