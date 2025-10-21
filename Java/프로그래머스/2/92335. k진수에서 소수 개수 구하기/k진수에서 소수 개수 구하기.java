class Solution {
    public int solution(int n, int k) {
        String kBaseString = Integer.toString(n, k);
        
        String[] candidates = kBaseString.split("0");
        
        int answer = 0;
        
        for (String pStr : candidates) {
            if (pStr.isEmpty()) {
                continue;
            }
            
            long p = Long.parseLong(pStr);
            
            if (isPrime(p)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}