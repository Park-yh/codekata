import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            
            Map<String, Integer> discountWindowMap = new HashMap<>();
            
            for (int j = i; j < i + 10; j++) {
                String item = discount[j];
                discountWindowMap.put(item, discountWindowMap.getOrDefault(item, 0) + 1);
            }
            
            if (canBuyAll(wantMap, discountWindowMap)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean canBuyAll(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String item : wantMap.keySet()) {
            int requiredCount = wantMap.get(item);
            int discountCount = discountMap.getOrDefault(item, 0);
            
            if (discountCount < requiredCount) {
                return false;
            }
        }
        
        return true;
    }
}