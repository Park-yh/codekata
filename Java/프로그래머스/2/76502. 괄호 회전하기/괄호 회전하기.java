import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            String rotatedS = s.substring(i) + s.substring(0, i);
            
            if (isCorrect(rotatedS)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ( (c == ')' && top != '(') || 
                     (c == ']' && top != '[') || 
                     (c == '}' && top != '{') ) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}