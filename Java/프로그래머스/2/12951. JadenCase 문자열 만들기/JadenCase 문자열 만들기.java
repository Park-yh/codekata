class Solution {
    public String solution(String s) {
        StringBuilder answerBuilder = new StringBuilder();
        
        boolean isStartOfWord = true;
        
        String lowerS = s.toLowerCase();

        for (char c : lowerS.toCharArray()) {
            if (isStartOfWord) {
                answerBuilder.append(Character.toUpperCase(c));
            } else {
                answerBuilder.append(c);
            }
            
            isStartOfWord = (c == ' ');
        }
        
        return answerBuilder.toString();
    }
}