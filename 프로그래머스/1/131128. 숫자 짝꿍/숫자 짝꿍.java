import java.util.stream.IntStream;

class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char ch : X.toCharArray()) {
            countX[ch - '0']++;
        }
        
        for (char ch : Y.toCharArray()) {
            countY[ch - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                answer.append(i);
            }
        }
        
        if (answer.length() == 0) {
            return "-1";
        }
        
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}