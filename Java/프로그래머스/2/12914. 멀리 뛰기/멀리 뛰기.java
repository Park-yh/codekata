class Solution {
    public long solution(int n) {
        if (n <= 2) {
            return n;
        }
        
        long prev1 = 1;
        long prev2 = 2;
        long current = 0;
        
        for (int i = 3; i <= n; i++) {
            current = (prev1 + prev2) % 1234567;
            
            prev1 = prev2;
            prev2 = current;
        }
        
        return current;
    }
}