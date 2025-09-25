import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        
        Set<Integer> uniqueSums = new HashSet<>();
        
        int[] extendedElements = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extendedElements[i] = elements[i];
            extendedElements[i + n] = elements[i];
        }
        
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int currentSum = 0;
                for (int i = start; i < start + length; i++) {
                    currentSum += extendedElements[i];
                }
                uniqueSums.add(currentSum);
            }
        }
        
        return uniqueSums.size();
    }
}