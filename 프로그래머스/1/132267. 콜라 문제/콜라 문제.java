class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int receivecola = (n / a) * b;
            answer += receivecola;
            n  = (n % a) + receivecola;
        }
        return answer;
    }
}